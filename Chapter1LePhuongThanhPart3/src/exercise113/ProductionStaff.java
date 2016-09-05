package exercise113;

public class ProductionStaff extends Staff {
	final int productNorms = 1000;
	final double rateBonuses = 0.05;
	private int numberProduct;

	public ProductionStaff(int numberProduct) {
		super();
		this.numberProduct = numberProduct;
	}

	public ProductionStaff() {
		super();
	}

	/**
	 * Check Bonuses of Business Staff return True of False
	 * 
	 * @return
	 */

	public boolean isBonuses() {
		if (numberProduct - productNorms > 0)
			return true;
		return false;
	}

	public ProductionStaff(String name, double coefficientsSalary,
			int numberPerson, double allowance, int numberProduct) {
		super(name, coefficientsSalary, numberPerson, allowance);
		this.numberProduct = numberProduct;
	}

	public double Bonuses() {
		double result = 0;
		if (isBonuses()) {
			result = (numberProduct - productNorms) * rateBonuses;
		}
		return result;
	}

	@Override
	public double calSalary() {

		return super.calSalary() + Bonuses();
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalary: " + calSalary() + "\nIncome Tax: "
				+ calcIncomeTaxes() + "\nPersonalIncomeTax: "
				+ calcPersonalIncomeTax() + "\nRealFiel: " + calcRealField();
	}

}
