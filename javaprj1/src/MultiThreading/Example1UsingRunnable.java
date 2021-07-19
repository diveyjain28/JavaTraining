package MultiThreading;
class MyThread1 implements Runnable { 
	String ss;
	public MyThread1(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class Example1UsingRunnable {
	public static void main(String [] args  ) {
		Thread t1 = new Thread(new MyThread1("t1"));
	     Thread t2 = new Thread(new MyThread1("t2"));
//	     MyThread t3 = new MyThread("t1");
//			MyThread t4 = new MyThread("t2");
	     t1.start();
	     t2.start();
//	     t3.start();
//     t4.start();
	    }
}
