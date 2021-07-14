package july8;

public class StaticBlockExample {
	static {
		System.out.println("Static block initializer called");
	}
	int x;
	{
		System.out.println("Initializer called");
		x=10;
	}
	public void display() {
		System.out.println("Value of x: "+x);
	}
	public static  void display2() {
		System.out.println("static method");
	}
}
