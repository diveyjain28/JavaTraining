package MultiThreading;

public class JoiningThreads extends Thread {
	public void run() {
		System.out.println("Start.. "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		System.out.println("End.. "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		JoiningThreads c1 = new JoiningThreads();
		JoiningThreads c2 = new JoiningThreads();
		System.out.println("Main Start.. ");
		c1.start();
		try {
			c1.join(); // Waiting for c1 to finish
		} catch (InterruptedException ie) {
		}
		c2.start();
		System.out.println("Main Ends.. ");
	}
}