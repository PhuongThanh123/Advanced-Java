package exercise115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create MainClass
 *
 */
public class MainClassIntrument {
	public static void main(String agrs[]) throws IOException{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		StringedIntrument stringedIntrument=new StringedIntrument();
		NonStringInstrument nonStringInstrument=new NonStringInstrument();
		System.out.println("========INTRUMENT=========");
		System.out.println("Enter name: ");
		String name=input.readLine();
		
		
		System.out.println("Enter production unit: ");
		String productionUnit=input.readLine();
		
		System.out.println("Select type: \n1: StringedInstrument \n2: NonStringedInstrument");
		int number=Integer.parseInt(input.readLine());
		
		switch(number){
		case 1:
			System.out.println("========Stringed Instrument========");
			System.out.println("Enter Number Tune");
			
			int numberTune=Integer.parseInt(input.readLine());
			stringedIntrument.setName(name);
			stringedIntrument.setProductionUnit(productionUnit);
			stringedIntrument.setNumberTune(numberTune);
			
			System.out.println("Information Play: "+stringedIntrument.toString());
			break;
		case 2:
			System.out.println("========Non Stringed Instrument========");
			System.out.println("Enter Manaul");
			
			String manual=input.readLine();
			nonStringInstrument.setManual(manual);
			
			System.out.println("Information Play: "+nonStringInstrument.toString());
			break;
			default:
				System.out.println("wrong select!");
				break;
		}
	}

}
