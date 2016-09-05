package exercise113;

public class Staff {

	private String name;
	private double coefficientsSalary;
	private int numberPerson;
	private double allowance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public int getNumberPerson() {
		return numberPerson;
	}

	public void setNumberPerson(int numberPerson) {
		this.numberPerson = numberPerson;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public Staff() {
		super();
	}

	public Staff(String name, double coefficientsSalary, int numberPerson,
			double allowance) {
		super();
		this.name = name;
		this.coefficientsSalary = coefficientsSalary;
		this.numberPerson = numberPerson;
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		String s;
		s = "Name: " + name + "\nCoefficients Salary:" + coefficientsSalary
				+ "\nNumber Porson: " + numberPerson + "\nAllowance: "
				+ allowance;
		return s;
	}

	public double calSalary() {
		final double salarybasic = 1260000;
		double salary = coefficientsSalary * salarybasic + allowance;
		return salary;
	}

	public double calcIncomeTaxes() {
		double result = calSalary() - 9000000 - numberPerson * 3600000;
		return result;
	}

	public double calcPersonalIncomeTax() {
		double result = 0;
		if (calcIncomeTaxes() <= EnumSalary.LEVEL2.getBegin()) {
			result = calcIncomeTaxes() * EnumSalary.LEVEL1.getTax();
		} else if (calcIncomeTaxes() <= EnumSalary.LEVEL3.getBegin()) {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL1.getEnd())
					* EnumSalary.LEVEL2.getTax();
		} else if (calcIncomeTaxes() <= EnumSalary.LEVEL4.getBegin()) {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ EnumSalary.LEVEL2.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL2.getEnd())
					* EnumSalary.LEVEL3.getTax();
		} else if (calcIncomeTaxes() <= EnumSalary.LEVEL5.getBegin()) {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ EnumSalary.LEVEL2.getMaxincometax()
					+ EnumSalary.LEVEL3.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL3.getEnd())
					* EnumSalary.LEVEL4.getTax();

		} else if (calcIncomeTaxes() <= EnumSalary.LEVEL6.getBegin()) {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ EnumSalary.LEVEL2.getMaxincometax()
					+ EnumSalary.LEVEL3.getMaxincometax()
					+ EnumSalary.LEVEL4.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL4.getEnd())
					* EnumSalary.LEVEL5.getTax();
		} else if (calcIncomeTaxes() <= EnumSalary.LEVEL7.getBegin()) {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ EnumSalary.LEVEL2.getMaxincometax()
					+ EnumSalary.LEVEL3.getMaxincometax()
					+ EnumSalary.LEVEL4.getMaxincometax()
					+ EnumSalary.LEVEL5.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL5.getEnd())
					* EnumSalary.LEVEL6.getTax();
		} else {
			result = EnumSalary.LEVEL1.getMaxincometax()
					+ EnumSalary.LEVEL2.getMaxincometax()
					+ EnumSalary.LEVEL3.getMaxincometax()
					+ EnumSalary.LEVEL4.getMaxincometax()
					+ EnumSalary.LEVEL5.getMaxincometax()
					+ EnumSalary.LEVEL6.getMaxincometax()
					+ (calcIncomeTaxes() - EnumSalary.LEVEL6.getEnd())
					* EnumSalary.LEVEL7.getTax();
		}
		return result;
	}

	public double calcRealField() {
		double result = calSalary() - calcPersonalIncomeTax();
		return result;
	}

}
