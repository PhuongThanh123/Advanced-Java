package exercise54ShareCounter;
/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: this thread share counter
 *
 */
public class ShareCounter extends Thread{
	private Thread t;
	private static int counter;
	private String nameThread;
	

	public ShareCounter(String nameThread) {
		super();
		this.nameThread = nameThread;
	}

	@Override
	public void run() {
		System.out.println("Running "+nameThread);
		try{
			for(int i=0;i<10;i++){
				counter++;
				System.out.println("Thread: "+nameThread+"--> Couter: "+counter);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Theard: "+ nameThread+" interrupted.");
		}
		System.out.println("Thread "+nameThread+" exiting.");
	}

	@Override
	public synchronized void start() {
		System.out.println("Starting "+nameThread);
		if(t==null){
			t=new Thread(this,nameThread);
			t.start();
		}
	}
	

}
