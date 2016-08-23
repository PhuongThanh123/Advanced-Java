package exercise115;

public abstract class Instrument {
	private String name;
	private String productionUnit;
	public abstract String play();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductionUnit() {
		return productionUnit;
	}
	public void setProductionUnit(String productionUnit) {
		this.productionUnit = productionUnit;
	}

	@Override
	public String toString() {
		return "Manual"+this.play();
	}
	
	
}
