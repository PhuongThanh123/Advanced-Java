package exercise52SumArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: Using Thread to calculate Sum of Array
 *
 */
public class MainClassSumOfArrayThread {

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number elemant array: ");
		int n=Integer.parseInt(input.readLine());
		
		
		int arr[]=new int[n];
		
		Random random=new Random();
		for(int i=0;i<n;i++){
			arr[i]=random.nextInt(10);
		}
		
		System.out.println("Input num of threads: ");
		int numThreads=Integer.parseInt(input.readLine());
		
		int sum=sum(arr, numThreads);
		
		String strArr ="";
		for(int value: arr){
			strArr+=value+" ";
		}
		System.out.println("Array: "+strArr);
		System.out.println("Sum: "+sum);
	}

	private static int sum(int[] arr, int numThreads) throws InterruptedException {
		int length=arr.length;
		int sum=0;
		
		//Create and start numThreads.
		SumThread[] ts=new SumThread[numThreads];
		for(int i=0;i<numThreads;i++){
			ts[i]=new SumThread((i*length)/numThreads, (i+1)*length/numThreads, arr);
			ts[i].start();
		}
		
		//Wait for the threads to finish and sum their results.
		for(int i=0;i<numThreads;i++){
			ts[i].join();
			sum+=ts[i].getSum();
		}
		return sum;
		
	}

}
