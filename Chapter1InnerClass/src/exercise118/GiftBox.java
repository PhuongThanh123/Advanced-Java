package exercise118;
/**
 * Author: Le Phuong Thanh 
 * Date: 19/08/2016 
 * Version: 1.0 
 * Description: Create class GiftBox
 *
 */
public class GiftBox {
	private String shape;
	private String color;
	final int price=10000;
	public GiftBox(String shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}
	public GiftBox() {
		super();
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Create inner name is Gift nest class GiftBox
	 *
	 */
	class Gift {
		private String name;
		private double weight;
		final int FEE = 200;

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		/**
		 * Method calculate fee of gift
		 * Out put: return result
		 * @return
		 */
		public double calFee() {
			return weight * FEE + GiftBox.this.price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Gift(String name, double weight) {
			super();
			this.name = name;
			this.weight = weight;
		}

		public Gift() {
			super();
		}

	}

}
