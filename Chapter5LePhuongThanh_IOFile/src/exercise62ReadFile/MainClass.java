package exercise62ReadFile;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class main handling count word test.
 *
 */
public class MainClass {
	
	public static void main(String[] args) throws IOException {
			
		System.out.println("Enter text: ");
		String text= readFile();
		System.out.println("----test---: "+text);
		String textWord[]=text.split(" ");
		
		//treeMap
		Map<String, Integer> mapTest=new TreeMap<String, Integer>();
		for(int i=0;i<textWord.length;i++){
			Integer count=mapTest.get(textWord[i]);
			if(count==null){
				count=0;
			}
			mapTest.put(textWord[i], ++count);
		}
		System.out.println(mapTest.size());
		System.out.println(mapTest);
		
	}
	
	/**
	 * @return String after read file
	 * @throws EOFException
	 */
	public static String readFile() throws EOFException {
		String s="";
		try (BufferedReader in = new BufferedReader(new FileReader("src/exercise62ReadFile/daily.txt"))) {
			
			while(in.readLine()!=null){
				s+=in.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return s;
		
	}
	

}
