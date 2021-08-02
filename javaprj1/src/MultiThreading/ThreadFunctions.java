package MultiThreading;
import java.util.*;
class Chat {
	boolean flag = false;
	Scanner s = new Scanner(System.in);
	public synchronized void Question() {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("PERSON 1: ");
		s.nextLine();
		flag = true;
		notify();
	}
	public synchronized void Answer() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("PERSON 2: ");
		s.nextLine();
		flag = false;
		notify();
	}
}
class T2 implements Runnable {
	Chat m;
	public T2(Chat m2) {
		this.m = m2;
		new Thread(this).start();
	}

	public void run() {
		while(true)
		{m.Answer();}
	}
}
class T1 implements Runnable {
	Chat m;
	public T1(Chat m1) {
		this.m = m1;
		new Thread(this).start();
	}
	public void run() {
		while(true)
		{m.Question();}
	}
}
public class ThreadFunctions {
	public static void main(String[] args) {
		Chat m = new Chat();
		new T1(m);
		new T2(m);
	}
}
