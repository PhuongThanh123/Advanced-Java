package Exercise31PrintArray;

import java.util.Arrays;
import java.util.List;
/**
 * @Author: Le Phuong Thanh 
 * @Date: 09/09/2016 
 * @Version: 1.0 
 * @Create Class Handling way normal
 *
 */
public class MainClassPrintArray {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		for(Integer n: list){
			System.out.println(n);
		}

	}

}
