package July12;
interface Anon{
	void fn();
	void fn2();
}
public class anonymousClass {
	public static void main(String[] arg)
	{
		Anon b=new Anon(){                              //class Main$1 implements A
			public void fn() {
				System.out.println("Hello");
			}
			public void fn2() {
				System.out.println("Hello2");
			}
			
		};
		
		b.fn();
		b.fn2();
	}
}
