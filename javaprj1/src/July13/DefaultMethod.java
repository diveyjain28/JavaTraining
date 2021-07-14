package July13;
interface Abbb
{
	String fn(String s); //SAM
	default void print(String s) {
		show();
		System.out.println("The String: "+ s);
	}

	private void show() {
		System.out.println("This is private method");
	}
}
public class DefaultMethod {
	public static void main(String[] ar) {
		Abbb a=String :: toUpperCase;
		a.print(a.fn("Java"));

	}
}
