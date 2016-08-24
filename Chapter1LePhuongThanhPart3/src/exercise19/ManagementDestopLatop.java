package exercise19;

import java.util.ArrayList;
/**
 * Author: Le Phuong Thanh
 * Date: 19/08/2016
 * Version: 1.0
 * Create class Management Destop Latop
 *
 */
public class ManagementDestopLatop {
	private ArrayList<Destop> destop;
	private ArrayList<Laptop> laptops;

	public ManagementDestopLatop() {
		super();
	}

	public ManagementDestopLatop(ArrayList<Destop> destop, ArrayList<Laptop> laptops) {
		super();
		this.destop = destop;
		this.laptops = laptops;
	}

	public ArrayList<Destop> getDestop() {
		return destop;
	}

	public void setDestop(ArrayList<Destop> destop) {
		this.destop = destop;
	}

	public ArrayList<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(ArrayList<Laptop> laptops) {
		this.laptops = laptops;
	}
	/**
	 * Function: calculate price of Destops
	 * Output: return sum price of Destops
	 * @return
	 */

	public double sumPriceDestop() {
		double sum = 0;
		if(destop==null)
			return 0;
		for (int i = 0; i < destop.size(); i++) {
			sum = sum + destop.get(i).getPrice();
		}
		return sum;
	}
	/**
	 * Function: calculate price of Laptop
	 * output: return sum price of Laptop
	 * @return
	 */

	public double sumPriceLaptop() {
		double sum = 0;
		if(laptops==null)
			return 0;
		for (int i = 0; i < laptops.size(); i++) {
			sum += sum + laptops.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public String toString() {
		String s = "";
		if (destop.size() != 0) {
			System.out.println("------List of DesTop-------\n");
			for (int i = 0; i < destop.size(); i++) {
				s += destop.get(i).toString();
				s += "-------------------------\n";
			}
		}
		if (laptops.size() != 0) {
			s = "------List of Laptop-----------\n";
			for (int i = 0; i < laptops.size(); i++) {
				s += laptops.get(i).toString();
				s += "----------------------------\n";
			}
		}
		return s;

	}

}
