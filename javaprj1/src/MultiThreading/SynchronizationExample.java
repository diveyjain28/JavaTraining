package MultiThreading;

	
class Account { // the 'monitor'
		int balance;
		String name;
		public Account(int b, String n) {
			name=n; balance = b;
		}
		public Account() {}
		// if 'synchronized' is removed, the outcome is unpredictable
		public synchronized void deposit(int deposit_amount) {
			System.out.println("\nDeposit amount " + deposit_amount + "in account: "+ name);
			balance += deposit_amount;
		}

		public synchronized void withdraw(int deposit_amount) {
			System.out.println("\nWithdrawn amount" + deposit_amount+ "from account: "+ name);
			balance -= deposit_amount;
		}
	public synchronized void enquire() {
			System.out.println("\nBalance for Account: " + name + " = " + balance);
		}
}
class DepoThread implements Runnable {
		Account account;
		int amt;

		public DepoThread(Account s, int a) {
			account = s;
			amt = a;
		}

		public void run() {
			account.deposit(amt);
		}
}
class DrawThread implements Runnable {
	Account account;
	int amt;

	public DrawThread(Account s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.withdraw(amt);
	}
}
class BalThread implements Runnable {
	Account account;

	public BalThread(Account s) {
		account = s;
	}

	public void run() {
		account.enquire();
	}
}
public class SynchronizationExample {
	
	
	public static void main(String[] args) {
		Account accountObject1 = new Account(1000, "Divey");
		Thread t11 = new Thread(new DepoThread(accountObject1, 10000));
		Thread t12 = new Thread(new DrawThread(accountObject1, 2000));
		Thread t13 = new Thread(new BalThread(accountObject1));
		
		Account accountObject2 = new Account(5000, "aaaa");
        Thread t21 = new Thread(new DepoThread(accountObject2, 10000));
		Thread t22 = new Thread(new DrawThread(accountObject2, 2000));
		Thread t23 = new Thread(new BalThread(accountObject2));
		t11.start();
		t12.start();
		t13.start();
		t21.start();
		t22.start();
		t23.start();
		
		
	}
}
