package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass17ManagementCD {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Exercise17ManagementCD emcd=new Exercise17ManagementCD();
		
		
		System.out.println("Enter ID CD: ");
		String idCD=input.readLine();
		emcd.setIdCD(idCD);
		
		System.out.println("Enter Name CD: ");
		String nameCD=input.readLine();
		emcd.setNameCD(nameCD);
		
		System.out.println("Enter Singer: ");
		String singer=input.readLine();
		emcd.setSinger(singer);
		
		System.out.println("Enter Number Song: ");
		Integer numberSong=Integer.parseInt(input.readLine());
		emcd.setNumberSong(numberSong);
		
		System.out.println("Enter Price: ");
		Double price =Double.parseDouble(input.readLine());
		emcd.setPrice(price);
		
		System.out.println("Information CD: \nId CD: "+idCD+"\nName: "+nameCD+"\nSinger: "+singer+"\nNumber Song: "+numberSong+"\nPrice: "+price);
		emcd.addCD();
	}

}
