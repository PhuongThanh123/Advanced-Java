package Exercise12;

import java.util.ArrayList;
import java.util.List;

public class Exercise17ManagementCD {
	private String idCD;
	private String nameCD;
	private String singer;
	private int numberSong;
	private double price;
	public String getIdCD() {
		return idCD;
	}
	public void setIdCD(String idCD) {
		this.idCD = idCD;
	}
	public String getNameCD() {
		return nameCD;
	}
	public void setNameCD(String nameCD) {
		this.nameCD = nameCD;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNumberSong() {
		return numberSong;
	}
	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Exercise17ManagementCD(String idCD, String nameCD, String singer,
			int numberSong, double price) {
		super();
		this.idCD = idCD;
		this.nameCD = nameCD;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}
	public Exercise17ManagementCD() {
		super();
	}
	public boolean checkDuplicate(String idCD){
		if(idCD==this.idCD)
			return false;
		return true;
	}
	public void addCD(){
		
		if(checkDuplicate(idCD)){
			addDetailsCD();
		}
		System.out.println("Done!");
	}
	
	
	public double addDetailsCD(){
		
		List<Object> arrayList=new ArrayList<Object>();
		arrayList.add(idCD);
		arrayList.add(nameCD);
		arrayList.add(singer);
		arrayList.add(numberSong);
		arrayList.add(price);
		 
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList[i]);
		}
		return 1;
	}


}
