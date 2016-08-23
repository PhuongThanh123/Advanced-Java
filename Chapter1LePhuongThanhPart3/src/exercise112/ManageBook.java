package exercise112;

import java.util.ArrayList;

public class ManageBook {
	private ArrayList<TextBook> arrayListTesx;
	private ArrayList<ReferenceBook> arrayListRefe;
	public ArrayList<TextBook> getArrayListTesx() {
		return arrayListTesx;
	}
	public void setArrayListTesx(ArrayList<TextBook> arrayListTesx) {
		this.arrayListTesx = arrayListTesx;
	}
	public ArrayList<ReferenceBook> getArrayListRefe() {
		return arrayListRefe;
	}
	public void setArrayListRefe(ArrayList<ReferenceBook> arrayListRefe) {
		this.arrayListRefe = arrayListRefe;
	}
	public ManageBook() {
		super();
	}
	public ManageBook(ArrayList<TextBook> arrayListTesx,
			ArrayList<ReferenceBook> arrayListRefe) {
		super();
		this.arrayListTesx = arrayListTesx;
		this.arrayListRefe = arrayListRefe;
	}
	public double sumTextBookNew(){
		double sum = 0;
		for(int i=0;i<arrayListTesx.size();i++){
			sum+=arrayListTesx.get(i).sumMoneyTBNew();
		}
		return sum;
	}
	public double sumTextBookOld(){
		double sum = 0;
		for(int i=0;i<arrayListTesx.size();i++){
			sum+=arrayListTesx.get(i).sumMoneyTBOld();
		}
		return sum;
	}
	public double avgReferenceBook(){
		double avg=0;
		for(int i=0;i<arrayListRefe.size();i++){
			avg=arrayListRefe.get(i).sumMoney();
		}
		double result=0;
		result=avg/arrayListRefe.size();
		return result;
	}
}
