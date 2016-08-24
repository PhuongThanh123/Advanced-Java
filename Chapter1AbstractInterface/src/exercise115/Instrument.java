package exercise115;
/**
 * Author: Le Phuong Thanh
 * Date: 23/08/2016
 * Version: 1.0
 * Create abstract class Intrument
 *
 */
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
