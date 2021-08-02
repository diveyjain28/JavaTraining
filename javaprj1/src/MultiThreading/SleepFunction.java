package MultiThreading;

public class SleepFunction implements Runnable { 
	Thread t; 
	public void run() 	{ 
		for (int i = 0; i < 4; i++)		{ 
			System.out.println(Thread.currentThread().getName() + " " + i); 
			try			{ 
				Thread.sleep(1000); // thread to sleep for 1000 milliseconds 
			}  catch (Exception e)		{ 
				System.out.println(e); 
			}		}	} 
	public static void main(String[] args) throws Exception	{ 
		Thread t = new Thread(new SleepFunction()); 
		t.start(); 
		Thread t2 = new Thread(new SleepFunction()); 
		t2.start(); 
		System.out.println("Main Thread: "+Thread.currentThread().getName() ); 
		
	}	}