package exercise51;

/**
 * @author Le Phuong Thanh
 * @version 1.0
 * @since 13/9/2016
 * @Desciption: this thread execute multithreaded programming
 *
 */
public class MultiThreadedApplications extends Thread {
	private Thread t;
	private String threadName;

	public MultiThreadedApplications(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 3; i > 0; i++) {
				System.out.println("Thread: " + threadName + ", " + i);
				// let the thread sleep for a while
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread: " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	@Override
	public synchronized void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
