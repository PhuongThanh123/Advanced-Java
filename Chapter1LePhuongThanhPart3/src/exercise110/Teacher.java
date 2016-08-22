package exercise110;

public class Teacher extends Human {
	private String classLeader;
	private double coefficientsSalary;
	private double allowance;
	final double salary=1260000;
	public String getClassLeader() {
		return classLeader;
	}
	public void setClassLeader(String classLeader) {
		this.classLeader = classLeader;
	}
	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	public double getAllowance() {
		return allowance;
	}
	public Teacher() {
		super();
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public Teacher(String name, String birthday, String address, String phone,
			String classLeader, double coefficientsSalary, double allowance) {
		super(name, birthday, address, phone);
		this.classLeader = classLeader;
		this.coefficientsSalary = coefficientsSalary;
		this.allowance = allowance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "Class Leader: "+classLeader+"Coefficients Salary: "+coefficientsSalary+"Allowance: "+allowance;
	}
	
}
