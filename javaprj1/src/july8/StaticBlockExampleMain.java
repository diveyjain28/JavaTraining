package july8;

public class StaticBlockExampleMain {
	
	static {
		System.out.println("Static block: called even before main(static method)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Instance created, but class Name is used: ");
		 StaticBlockExample a;
		System.out.println("Instance created: ");
		a=new  StaticBlockExample();
		a.display();
		 StaticBlockExample.display2();
		a.display2();
	}

}
