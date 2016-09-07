package main;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 06-Sep-2016 11:13:12 AM
 */
public class Trainee extends Person {

	private Date birthday;
	private ScoreFinal scoreFinal;
	
	public Trainee() {
		super();
	}

	public Trainee(String email, String name, String phone,Date birthday, ScoreFinal scoreFinal) {
		super(email, name,phone);
		this.birthday = birthday;
		this.scoreFinal = scoreFinal;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public ScoreFinal getScoreFinal() {
		return scoreFinal;
	}

	public void setScoreFinal(ScoreFinal scoreFinal) {
		this.scoreFinal = scoreFinal;
	}
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		String s="\t"+name+"\t\t"+phone+"\t"+dateFormat.format(birthday)+"\t"+email;
		return s;
	}
	
	

}