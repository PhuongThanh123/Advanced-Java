package exercise54ShareCounter;
/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: Class main test class ShareCounter
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			ShareCounter shareCounter=new ShareCounter(""+i);
			shareCounter.start();
			
		}

	}

}
