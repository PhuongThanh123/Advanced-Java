package workWitXML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class MainClassXML {

	static String filePath = "src/workWitXML/cd.xml";

	public static void main(String[] args) throws FileNotFoundException,
			ParserConfigurationException, SAXException, IOException,
			ClassNotFoundException, SQLException {

		CDController cdController = new CDController();
		cdController.textTransfomer(filePath);
		System.out.println(cdController.viewFile(filePath));
	}
}
