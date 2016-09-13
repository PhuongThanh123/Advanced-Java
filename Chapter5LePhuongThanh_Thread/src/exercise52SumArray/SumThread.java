package exercise52SumArray;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: this thread finds the sum of a subsection of an array
 *
 */
public class SumThread extends Thread{
	private int low, high;
	private int[] arr;
	private int sum=0;
	
	public SumThread(int low, int high, int []arr){
		this.low=low;
		this.high=high;
		this.arr=arr;
	}

	@Override
	public void run() {
		for(int i=this.low;i<this.high;i++){
			this.setSum(this.getSum() + this.arr[i]);
		}
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
