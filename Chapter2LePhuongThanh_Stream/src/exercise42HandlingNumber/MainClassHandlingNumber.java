package exercise42HandlingNumber;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MainClassHandlingNumber {

	public static void main(String[] args) {
		//Create list numner contain element integer
		List<Integer> listNumber=Arrays.asList(1,2,3,4,5,6,7,78,9,343,45,345,54,0);
		
		//Create List number 2 contains element pow 2
		List<Integer> listNumber2=listNumber.stream().map(e -> e*e).collect(Collectors.toList());
		listNumber2.stream().forEach(System.out::println);
		
		IntSummaryStatistics statisticsNumber=listNumber2.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("Max number: "+statisticsNumber.getMax());
		System.out.println("Min number: "+statisticsNumber.getMin());
		System.out.println("Sum number: "+statisticsNumber.getSum());
		System.out.println("Average number: "+statisticsNumber.getAverage());
		
		//Create List number 3 contains element is prime
		List<Integer> listNumber3=listNumber2.stream().filter(e->isPrime(e)).collect(Collectors.toList());
		System.out.println("List number 3: "+listNumber3);
		
		//Create List number 2 contains elements is square numbers
		List<Integer> listNumber4=listNumber.stream().filter(e->isSquareNumbers(e)).collect(Collectors.toList());
		System.out.println("List 3: "+listNumber4);
	}
	
	/**
	 * @param n
	 * @return true of false
	 * @Desciption: Check Prime
	 */
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i=2;i<n;i++)
			if(n%2==0)
				return false;
						
		return true;
	}
	
	/**
	 * @param n
	 * @return true of false
	 * @Desciption: Check Square Numbers
	 */
	public static boolean isSquareNumbers(int n){
		double h=Math.sqrt(n);
		if(h*h==n)
			return true;
		return false;
	}

}
