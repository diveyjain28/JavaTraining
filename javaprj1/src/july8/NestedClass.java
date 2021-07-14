package july8;

public class NestedClass {
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}
	
	public static class B{  //javac generates A$B.class
		public static void print() {
			System.out.println("I am inside static inner Class A.B");
		}
	}
	
}