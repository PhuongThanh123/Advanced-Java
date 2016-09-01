package main;


/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @created 01-Sep-2016 3:04:12 PM
 */
public class CheongsamFactory extends AoDaiFactory {

	
	public AoDai getAoDai(){
		return new Cheongsam();
	}

}