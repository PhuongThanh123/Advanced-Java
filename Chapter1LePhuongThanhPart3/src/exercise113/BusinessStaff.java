package exercise113;

public class BusinessStaff extends Staff {
	private double businessWages;
	private double rateOfBusinessWages;

	

	public double getBusinessWages() {
		return businessWages;
	}



	public void setBusinessWages(double businessWages) {
		this.businessWages = businessWages;
	}



	public double getRateOfBusinessWages() {
		return rateOfBusinessWages;
	}



	public void setRateOfBusinessWages(double rateOfBusinessWages) {
		this.rateOfBusinessWages = rateOfBusinessWages;
	}






	public BusinessStaff(String name, double coefficientsSalary,
			int numberPerson, double allowance, double businessWages,
			double rateOfBusinessWages) {
		super(name, coefficientsSalary, numberPerson, allowance);
		this.businessWages = businessWages;
		this.rateOfBusinessWages = rateOfBusinessWages;
	}



	public BusinessStaff() {
		super();
	}

	public double Bonuses(){
		double result=0;
		result=businessWages*rateOfBusinessWages;
		return result;
	}


	/**
	 * function calculate salary + bonuses
	 * return result sum salary
	 * @return
	 */
	@Override
	public double calSalary() {
		
		return super.calSalary()+Bonuses();
	}



	@Override
	public double calcIncomeTaxes() {
		return calcIncomeTaxes();
	}



	@Override
	public double calcPersonalIncomeTax() {
		return calcPersonalIncomeTax();
	}



	@Override
	public double calcRealField() {
		return calcRealField();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSalary: "+calSalary()+"\nIncome Tax: "+calcIncomeTaxes()+"\nPersonalIncomeTax: "+calcPersonalIncomeTax()
				+"\nRealFiel: "+calcRealField();
	}
	
}
