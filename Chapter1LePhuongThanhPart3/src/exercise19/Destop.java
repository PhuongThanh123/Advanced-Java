package exercise19;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Create class Destop
 *
 */
public class Destop extends Computer{
	private String cpu;
	private String ram;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public Destop() {
		super();
	}
	public Destop(String id, double price, String manufacturer, int quantity,String cpu, String ram) {
		super(id, price, manufacturer,quantity);
		this.cpu = cpu;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return super.toString()+" CPU: "+cpu+" RAM: "+ram;
	}
	

}
