package main;


/**
 * @version 1.0
 * @created 01-Sep-2016 2:56:19 PM
 */
public class TraditionalAoDaiFactory extends AoDaiFactory {

		public AoDai getAoDai(){
		return new TraditionalAoDai();
	}

}