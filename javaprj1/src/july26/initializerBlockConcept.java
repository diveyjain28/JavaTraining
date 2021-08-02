package july26;

public class initializerBlockConcept {
	{
		System.out.println("3. Initializer Block : executed before any Object is created. ");
		System.out.println("3. Initializer Block : Acts like a constructor ");
	}
	static {
		System.out.println("1. Static Block : executed before class functionality is called. ");
		System.out.println("1. Static Block : executed before static methods even main()/ Object call, etc. ");
	}
	initializerBlockConcept(){
		System.out.println("4. Constructor: called when a new Object is made");
	}
	public static void fn() {
		System.out.println("5. Static method called at class level");
	}
	public void Ofn() {
		System.out.println("6. Normal method called at Object level");
	}
	
public static void main(String[] a) {
		System.out.println("2. Main is executing..");
		initializerBlockConcept m=new initializerBlockConcept(); //Initializer block and then constructor called.
		initializerBlockConcept.fn(); //static function called
		m.Ofn();
	}
}
