package july8;


public class NestedMain{
	public static void main(String[] args) {
		NestedClass a=new NestedClass ();
		a.outerPrint();
		//A.B b=new A.B();
		NestedClass.B.print();
	}
}
