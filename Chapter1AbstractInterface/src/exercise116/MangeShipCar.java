package exercise116;

import java.util.ArrayList;

public class MangeShipCar {
	private ArrayList<Car> arrayListCa;
	private ArrayList<Ship> arrayListShi;

	public MangeShipCar() {
		super();
	}

	public MangeShipCar(ArrayList<Car> arrayListCa, ArrayList<Ship> arrayListShi) {
		super();
		this.arrayListCa = arrayListCa;
		this.arrayListShi = arrayListShi;
	}

	public ArrayList<Car> getArrayListCa() {
		return arrayListCa;
	}

	public void setArrayListCa(ArrayList<Car> arrayListCa) {
		this.arrayListCa = arrayListCa;
	}

	public ArrayList<Ship> getArrayListShi() {
		return arrayListShi;
	}

	public void setArrayListShi(ArrayList<Ship> arrayListShi) {
		this.arrayListShi = arrayListShi;
	}
	

}
