package exercise71ManagmentPhone;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagementContact {
//	Contact c = new Contact();
	List<Contact> listContact=new ArrayList<Contact>();
	
	
	public ManagementContact() {
		
	}

	public ManagementContact(String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		this.viewFile(filePath);
	}

	public List<Contact> getListContact() {
		return listContact;
	}

	public void setListContact(List<Contact> listContact) {
		this.listContact = listContact;
	}
	
	public void addNew(Contact c) {
		listContact.add(c);
		
	}
	public String deleteContact( String name, String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException, TransformerException {
		
		Document doc= getDoc(filePath);
		Element rootElement = doc.getDocumentElement();

		NodeList nodes = doc.getElementsByTagName("contact");
		
//		while (rootElement.hasChildNodes()) {
//			rootElement.removeChild(rootElement.getFirstChild());
//		}
//		System.out.println("Delete all!");
		
		//duyet node
		for (int i = 0; i < nodes.getLength(); i++) {
			//lay node dang duyet
			Element contact = (Element) nodes.item(i);
			// <name> cua node đó
			Element nameContact = (Element) contact.getElementsByTagName("name").item(0);
			//lay value of node name
			String pName = nameContact.getTextContent();
			//so sanh
			if (pName.equals(name)) {
				//bang xoa node do
				rootElement.removeChild(contact);
				//write file
				TransformerFactory transformerFactory = TransformerFactory
						.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(
						new File(filePath));

				transformer.transform(source, result);
				//thong bao kq
				return name + " was removed";
			}
		}
		
		return name+" was not find";

	}

	public Document getDoc(String filePath) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		//String filePath="src/exercise71ManagmentPhone/abc.xml";
		File xmlFile=new File(filePath);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root element
		Document doc = docBuilder.newDocument();
		Element rootElement;
		if(xmlFile.isFile()){
			doc=docBuilder.parse(new FileInputStream(xmlFile));
			doc.getDocumentElement().normalize();
			
		
		}else{
			rootElement=doc.createElement("Contact123");//create root
			doc.appendChild(rootElement);
					
		}
		
		

		return doc;
	}
	public void textTransfomer(Contact c, String filePath) throws FileNotFoundException, SAXException, IOException {

		
		try {
			//String filePath="src/exercise71ManagmentPhone/Contact.xml";
			File xmlFile=new File(filePath);
			Document doc =getDoc(filePath);
			Element rootElement=doc.getDocumentElement();
			// contact
			Element contact = doc.createElement("contact");
			rootElement.appendChild(contact);

			// name element
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode(c.getName()));
			contact.appendChild(name);

			// phone element
			Element phone = doc.createElement("phone");
			phone.appendChild(doc.createTextNode(c.getNumberPhone()));
			contact.appendChild(phone);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			DOMSource source = new DOMSource(doc);

			
			StreamResult result = new StreamResult(xmlFile);
			
			transformer.transform(source, result);
			System.out.println("This is success!");
			
			/*if(xmlFile.isFile()){
				doc=docBuilder.parse(new FileInputStream(xmlFile));
				doc.getDocumentElement().normalize();
				rootElement=doc.getDocumentElement();// get root
				
			
			}else{
				System.out.println("No find: "+filePath);
				System.out.println("Create new file : Contact 123");
				rootElement=doc.createElement("Contact123");//create root
						doc.appendChild(rootElement);
						StreamResult result = new StreamResult(filePath);

						
			}*/

		} catch (ParserConfigurationException | TransformerException|NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public Contact getFileContact(Node node) {
		Contact contact=new Contact();
		if(node.getNodeType()==Node.ELEMENT_NODE){
			Element element=(Element) node;
			contact.setName(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
			contact.setNumberPhone(element.getElementsByTagName("phone").item(0).getChildNodes().item(0).getNodeValue());
		}
		return contact;
	}
	
	public void viewFile( String filePath) throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
		listContact=new ArrayList<Contact>();
		
		//get Dom
		Document doc=getDoc(filePath);
		Element rootElement=doc.getDocumentElement();
		 NodeList nodeList=rootElement.getElementsByTagName("contact");
		for(int i=0;i<nodeList.getLength();i++){
			listContact.add(getFileContact(nodeList.item(i)));
		}
		
	}
//	@Override
	public String toString(String filePath)
			throws FileNotFoundException, 
			ParserConfigurationException, SAXException, IOException {
		viewFile(filePath);
		String s="========List Contact========\n";
		s+="Name\t Phone\n";
		s+="-------------------------\n";
		for(int i=0;i<listContact.size();i++){
			s+=listContact.get(i).toString();
		}
		return s;
	}
	

}
