package Exercise;

public enum Enum16Salary {
	  LEVEL1(0,5000000,0.05,250000),
	  LEVEL2(50000000,10000000,0.1,500000),
	  LEVEL3(10000000,18000000,0.15,1200000),
	  LEVEL4(18000000,32000000,0.2,2800000),
	  LEVEL5(320000000,52000000,0.25,5000000),
	  LEVEL6(520000000,80000000,0.3,8400000),
	  LEVEL7(80000000,0.35);
	
	
	private double begin;
	private double end;
	private double tax;
	private double maxincometax;
	private Enum16Salary(double begin, double tax) {
		this.setBegin(begin);
		this.setTax(tax);
	}
	private Enum16Salary(double begin, double end, double tax, double maxincometax) {
		this.setBegin(begin);
		this.setEnd(end);
		this.setTax(tax);
		this.setMaxincometax(maxincometax);
	}
	public double getBegin() {
		return begin;
	}
	public void setBegin(double begin) {
		this.begin = begin;
	}
	
	public double getMaxincometax() {
		return maxincometax;
	}
	public void setMaxincometax(double maxincometax) {
		this.maxincometax = maxincometax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getEnd() {
		return end;
	}
	public void setEnd(double end) {
		this.end = end;
	}

}
