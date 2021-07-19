package MultiThreading;
import java.util.*;

class Account1 { // the 'monitor'
	int balance;
	String name;
	public Account1(int b, String n) {
		name=n; balance = b;
	}
	public Account1() {}
	// if 'synchronized' is removed, the outcome is unpredictable
	public synchronized void deposit(int deposit_amount) {
		//System.out.println("\nDeposit amount " + deposit_amount + "in account: "+ name);
		balance += deposit_amount;
	}

	public synchronized void withdraw(int deposit_amount) {
		//System.out.println("\nWithdrawn amount" + deposit_amount+ "from account: "+ name);
		balance -= deposit_amount;
	}
public synchronized void enquire() {
		System.out.println("\nBalance for Account: " + name + " = " + balance);
	}
}
class DepoThread1 implements Runnable {
	Account1 account;
	int amt;

	public DepoThread1(Account1 s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.deposit(amt);
	}
}
class DrawThread1 implements Runnable {
Account1 account;
int amt;

public DrawThread1(Account1 s, int a) {
	account = s;
	amt = a;
}

public void run() {
	account.withdraw(amt);
}
}
class BalThread1 implements Runnable {
Account1 account;

public BalThread1(Account1 s) {
	account = s;
}

public void run() {
	account.enquire();
}
}

public class SynchronizationExercise {
public static void main(String args[])
{  int ch=0;
    Scanner s=new Scanner(System.in);
    ArrayList<Account1> a=new ArrayList<Account1>();
    Thread t1 ;//= new Thread(new DepoThread1(temp,bal));
   // t1.start();
//    Thread t2 ;//= new Thread(new DepoThread1(temp,bal));
//    t2.start();
//    Thread t3 ;//= new Thread(new DepoThread1(temp,bal));
//    t3.start();
    while(ch!=5)
    {	
     System.out.println("Enter 1 to Create new Account");
	 System.out.println("Enter 2 to Deposit");
	 System.out.println("Enter 3 to Withdraw");
	 System.out.println("Enter 4 to check balance");
	 System.out.println("Enter 5 to EXIT");
	 ch=s.nextInt();
	 
	 Account1 temp;
	 if(ch==1)
	 {
		 s.nextLine();
			System.out.print("Enter the Name of Account holder:");
			String name=s.nextLine();
		System.out.print("Enter the Intial Balance:");
		int bal=s.nextInt();
		
		a.add(new Account1(bal,name));
		System.out.println("New Account Created");
	 }
	 if(ch==2)
	 {   s.nextLine();
		
		 System.out.print("Enter the account holder name:");
	     String name=s.nextLine();
	     System.out.print("Enter the amount to be Deposited:");
	     int bal=s.nextInt();
	     
	     for(int i=0;i<a.size();i++)
	     {
	    	 if(a.get(i).name.equals(name))
	    	 {
	    		 temp=a.get(i);
	    		 t1 = new Thread(new DepoThread1(temp,bal));
	    		 t1.run();
	    	 }
	     }
	 }
	 if(ch==3)
	 {   s.nextLine();
		 System.out.print("Enter the account holder name:");
	     String name=s.nextLine();
	     System.out.print("Enter the amount to be Withdraw:");
	     int bal=s.nextInt();
	     
	     for(int i=0;i<a.size();i++)
	     {
	    	 if(a.get(i).name.equals(name))
	    	 {
	    		 temp=a.get(i);
	    		 //Thread t = new Thread(new DrawThread1(temp, bal));
	    		 t1 = new Thread(new DrawThread1(temp, bal));
	    		 t1.run();
	    		 //t.start();
	    	}
	     }
	 }
	 if(ch==4)
	 { s.nextLine();
		
		 System.out.print("Enter the account holder name:");
	     String name=s.nextLine();
	     
	     
	     for(int i=0;i<a.size();i++)
	     {
	    	 if(a.get(i).name.equals(name))
	    	 {
	    		 temp=a.get(i);
	    		
	    		 t1 = new Thread(new BalThread1(temp));
	    		 t1.run();
	    	 }
	     }
	 }
	 if(ch==5)
		 System.out.println("BYE");
	 
    }
}
}
