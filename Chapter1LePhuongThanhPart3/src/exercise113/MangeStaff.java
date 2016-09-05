package exercise113;

import java.util.ArrayList;

public class MangeStaff {

	private ArrayList<BusinessStaff> arrayListBusiness;
	private ArrayList<ProductionStaff> arrayListProduction;

	public MangeStaff(ArrayList<BusinessStaff> arrayListBusinessStaff,
			ArrayList<ProductionStaff> arrayListProductionStaff) {
		super();
		this.arrayListBusiness = arrayListBusinessStaff;
		this.arrayListProduction = arrayListProductionStaff;
	}

	public ArrayList<BusinessStaff> getArrayListBusinessStaff() {
		return arrayListBusiness;
	}

	public void setArrayListBusinessStaff(
			ArrayList<BusinessStaff> arrayListBusinessStaff) {
		this.arrayListBusiness = arrayListBusinessStaff;
	}

	public ArrayList<ProductionStaff> getArrayListProductionStaff() {
		return arrayListProduction;
	}

	public void setArrayListProductionStaff(
			ArrayList<ProductionStaff> arrayListProductionStaff) {
		this.arrayListProduction = arrayListProductionStaff;
	}

	public MangeStaff() {
		super();
	}

	public double avgBusiness() {
		double result = 0;
		double avg = 0;
		for (int i = 0; i < arrayListBusiness.size(); i++) {
			result = arrayListBusiness.get(i).calcRealField() + result;
		}
		avg = result / arrayListBusiness.size();
		return avg;
	}

	public double avgPro() {
		double result = 0;
		double avg = 0;
		for (int i = 0; i < arrayListProduction.size(); i++) {
			result = arrayListProduction.get(i).calcRealField() + result;
		}
		avg = result / arrayListProduction.size();
		return avg;
	}

}
