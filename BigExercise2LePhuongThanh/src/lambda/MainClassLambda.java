package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @ Desciptione: Class handling list color
 */
public class MainClassLambda {
	static List<String> listColor = new ArrayList<String>();

	public static void main(String[] args) {

		createList();
		System.out.println("------------List Color is created-----------");
		toString(listColor);

		listColor = createList();
		sortLengthMin(listColor);
		sortLengthMax(listColor);
		sortAlphabet(listColor);
	}

	/**
	 * this is method create list color
	 * @return list color is created
	 */
	public static List<String> createList() {
		listColor = new ArrayList<String>();
		listColor.add("White");
		listColor.add("Black");
		listColor.add("Red");
		listColor.add("Pink");
		listColor.add("Yellow");
		listColor.add("Blue");
		listColor.add("Gin");
		listColor.add("Purple");
		listColor.add("Orange");
		listColor.add("Gray");
		return listColor;

	}

	/**
	 * this method print list color
	 * @param listColor
	 */
	public static void toString(List<String> listColor) {
	
		listColor.forEach(e -> System.out.println(e));

	}

	/**
	 * this is method print list color is sorted length of color, from min to max
	 * @param listColor
	 */
	public static void sortLengthMin(List<String> listColor) {

		Collections.sort(listColor, (o1, o2) -> new Integer(o1.length())
				.compareTo(new Integer(o2.length())));
		System.out
				.println("----------Sort following Length! Min to Max --------------");
		toString(listColor);
	}
	
	/**
	 * this is method print list color is sorted length of color, form max to min
	 * @param listColor
	 */
	public static void sortLengthMax(List<String> listColor) {

		Collections.sort(listColor, (o1, o2) -> new Integer(o2.length())
				.compareTo(new Integer(o1.length())));
		System.out
				.println("----------Sort following Length! Max to Min --------------");
		toString(listColor);
	}
	/**
	 * this is method print list color is sorted length of color following alphabet
	 * @param listColor
	 */
	public static void sortAlphabet(List<String> listColor) {

		Collections.sort(listColor, (o1, o2) -> (o1)
		.compareTo(o2));
		System.out
				.println("----------Sort following Alphabet --------------");
		toString(listColor);
	}

}
