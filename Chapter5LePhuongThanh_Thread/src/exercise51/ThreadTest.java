package exercise51;
/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: class main test thread
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		MultiThreadedApplications applications=new MultiThreadedApplications("Google");
		applications.start();
		
		MultiThreadedApplications applications2=new MultiThreadedApplications("Yahoo");
		applications2.start();
		
		MultiThreadedApplications applications3=new MultiThreadedApplications("Facebook");
		applications3.start();

	}

}
