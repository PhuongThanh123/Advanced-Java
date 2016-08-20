package Exercise12;

public class Exercise16Salary {

	private double coefficients;
	private double allowance;
	private int numberPerson;

	public double getCoefficients() {
		return coefficients;
	}

	public void setCoefficients(double coefficients) {
		this.coefficients = coefficients;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public int getNumberPerson() {
		return numberPerson;
	}

	public void setNumberPerson(int numberPerson) {
		this.numberPerson = numberPerson;
	}

	public Exercise16Salary() {
		super();
	}

	public Exercise16Salary(double coefficients, double allowance,
			int numberPerson) {
		super();
		this.coefficients = coefficients;
		this.allowance = allowance;
		this.numberPerson = numberPerson;
	}

	public double calSalary() {
		final double salarybasic = 1260000;
		double salary = coefficients * salarybasic + allowance;
		return salary;
	}

	public double calcIncomeTaxes() {
		double result = calSalary() - 9000000 - numberPerson * 3600000;
		return result;
	}

	public double calcPersonalIncomeTax() {
		double result = 0;
		if (calcIncomeTaxes() <= Enum16Salary.LEVEL2.getBegin()) {
			result = calcIncomeTaxes() * Enum16Salary.LEVEL1.getTax();
		} else if (calcIncomeTaxes() <= Enum16Salary.LEVEL3.getBegin()) {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL1.getEnd())
					* Enum16Salary.LEVEL2.getTax();
		} else if (calcIncomeTaxes() <= Enum16Salary.LEVEL4.getBegin()) {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ Enum16Salary.LEVEL2.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL2.getEnd())
					* Enum16Salary.LEVEL3.getTax();
		} else if (calcIncomeTaxes() <= Enum16Salary.LEVEL5.getBegin()) {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ Enum16Salary.LEVEL2.getMaxincometax()
					+ Enum16Salary.LEVEL3.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL3.getEnd())
					* Enum16Salary.LEVEL4.getTax();

		} else if (calcIncomeTaxes() <= Enum16Salary.LEVEL6.getBegin()) {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ Enum16Salary.LEVEL2.getMaxincometax()
					+ Enum16Salary.LEVEL3.getMaxincometax()
					+ Enum16Salary.LEVEL4.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL4.getEnd())
					* Enum16Salary.LEVEL5.getTax();
		} else if (calcIncomeTaxes() <= Enum16Salary.LEVEL7.getBegin()) {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ Enum16Salary.LEVEL2.getMaxincometax()
					+ Enum16Salary.LEVEL3.getMaxincometax()
					+ Enum16Salary.LEVEL4.getMaxincometax()
					+ Enum16Salary.LEVEL5.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL5.getEnd())
					* Enum16Salary.LEVEL6.getTax();
		} else {
			result = Enum16Salary.LEVEL1.getMaxincometax()
					+ Enum16Salary.LEVEL2.getMaxincometax()
					+ Enum16Salary.LEVEL3.getMaxincometax()
					+ Enum16Salary.LEVEL4.getMaxincometax()
					+ Enum16Salary.LEVEL5.getMaxincometax()
					+ Enum16Salary.LEVEL6.getMaxincometax()
					+ (calcIncomeTaxes() - Enum16Salary.LEVEL6.getEnd())
					* Enum16Salary.LEVEL7.getTax();
		}
		return result;
	}

	public double calcRealField() {
		double result = calSalary() - calcPersonalIncomeTax();
		return result;
	}

}
