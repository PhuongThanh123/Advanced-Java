package exercise111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainClassManageTransaction {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("========TRANSACTION=========");
		System.out.println("Enter Id: ");
		String idTransaction=input.readLine();
		
		System.out.println("Enter Date (dd/MM/yyyy: ");
		String date=input.readLine();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		Date dateTransaction=dateFormat.parse(date);
		
		System.out.println("Enter quantity: ");
		double quantity=Double.parseDouble(input.readLine());
		
		System.out.println("Select transaction: \n1: Goldtrading \n2: CurrencyTrading");
		int number=Integer.parseInt(input.readLine());
		boolean flag=true;
		while (flag){
			switch (number) {
			case 1:
				System.out.println("======GOLDTRADING======");
				System.out.println("Enter Type Gold: ");
				
				
				break;

			default:
				break;
			}
			
		}

	}

}
