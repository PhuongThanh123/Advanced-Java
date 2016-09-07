package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ManagementTrainee {
	private ArrayList<Trainee> arrayTrainee = new ArrayList<Trainee>();
	private ManagementScoreFinal managementScoreFinal = new ManagementScoreFinal();

	public ArrayList<Trainee> getArrayTrainee() {
		return arrayTrainee;
	}

	public void setArrayTrainee1()
			throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("15/02/1993");

		managementScoreFinal.setScoreFinal1();
		this.arrayTrainee.add(new Trainee("lephuongthanh1502@gmail.com","Le Phuong Thanh ", "0987654321", date, managementScoreFinal.getScoreFinal()));
	}

	public void setArrayTrainee2()
			throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("15/02/1993");

		managementScoreFinal.setScoreFinal2();
		this.arrayTrainee.add(new Trainee("Bichphuong@gmail.com","Nguyen Bich Phuong", "0987654321", date, managementScoreFinal.getScoreFinal()));
	}

	public void setArrayTrainee3()
			throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("15/02/1993");

		managementScoreFinal.setScoreFinal3();
		this.arrayTrainee.add(new Trainee("luyennguyen@gmail.com","Nguyen Thi Luyen", "0987654321", date, managementScoreFinal.getScoreFinal()));
	}

	public ManagementTrainee(ArrayList<Trainee> arrayTrainee) {
		super();
		this.arrayTrainee = arrayTrainee;
	}

	public ManagementTrainee() {
		super();
	}
	public void setAllTrainee() throws ParseException{
		managementScoreFinal.setAllScoreFinal();
		setArrayTrainee1();
		setArrayTrainee2();
		setArrayTrainee3();
	}


	public String toStringTrainee() {
		String s = "\tName: \t\t\t\tPhone: \t\tBirthDay: \tEmail: \n";
		for(int i=0;i<arrayTrainee.size();i++){
			s+="No. "+(i+1)+arrayTrainee.get(i).toString()+"\n";
		}
		return s;
	}
	
	

}
