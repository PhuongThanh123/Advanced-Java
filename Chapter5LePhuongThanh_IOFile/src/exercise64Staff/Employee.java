package exercise64Staff;

import java.text.DecimalFormat;

/**
 * Author: Le Phuong Thanh Date: 27/08/2016 Version: 1.0 Create Class Salary
 *
 */
public class Employee {
	private String name;
	private double coefficients;
	private double allowance;
	private int numberPerson;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public Employee(String name, double coefficients, double allowance,
			int numberPerson) {
		super();
		this.name = name;
		this.coefficients = coefficients;
		this.allowance = allowance;
		this.numberPerson = numberPerson;
	}

	public Employee() {
		super();
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

	DecimalFormat decimal = new DecimalFormat("#,###");

	@Override
	public String toString() {

		return this.name + "\t" + this.coefficients + "\t" + this.allowance
				+ "\t" + this.numberPerson + "\t" + calSalary() + "\t"+calcPersonalIncomeTax()+"\t"
				+ this.calcIncomeTaxes()+"\t"+calcRealField();
	}

}
