package july8;

public class NestedEX2 {
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}

	public static class MainApp { //inner Main class: A$MainApp.class

		public static void main(String[] args) { //inner class main()
			NestedEX2 a = new NestedEX2();
			a.outerPrint();
		}

	}
}
