package Exercise121ManagementCD;

/**
 * @Author: Le Phuong Thanh
 * @Date: 27/08/2016
 * @Version: 1.0
 * @Create Class CD
 *
 */

public class CD implements Comparable<CD> {
	private String idCD;
	private String nameCD;
	private String singer;
	private int numberSong;
	private double price;

	public String getIdCD() {
		return idCD;
	}

	public void setIdCD(String idCD) {
		this.idCD = idCD;
	}

	public String getNameCD() {
		return nameCD;
	}

	public void setNameCD(String nameCD) {
		this.nameCD = nameCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CD() {
		super();
	}

	public CD(String idCD, String nameCD, String singer, int numberSong,
			double price) {
		super();
		this.idCD = idCD;
		this.nameCD = nameCD;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nInformation CD: \nId CD: " + idCD + "\nName: " + nameCD
				+ "\nSinger: " + singer + "\nNumber Song: " + numberSong
				+ "\nPrice: " + price + "\n";
	}

	@Override
	public int compareTo(CD o) {

		return this.nameCD.compareTo(o.nameCD);
	}

}
