package Exercise126StatisticalTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter text: ");
		String text=input.readLine();
		
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

}
