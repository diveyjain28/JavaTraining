package MultiThreading;
class MyThread11 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
}
public class YieldFunction {
	public static void main(String[] args) {
		MyThread11 t = new MyThread11();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
			// Control passes to child thread
			Thread.yield();
			// After execution of child Thread main thread takes over
			// System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}
