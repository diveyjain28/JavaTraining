package July12;

class chain{
	int x;
	public chain print() {
		System.out.println("Next Iteration is from print() : " +  x);
		return new chain(8);
	}
	public chain forward() {
		System.out.println("Next Iteration is from forward(): " +  x);
		return new chain(5);
	}
	public void last() {
		System.out.println("last Iteration : " +  x);
	}
	public chain(int a) {x=a;}
	public chain() {}
}

public class MethodChaining {
	public static void main(String[] ar) {
	    chain a=new chain(9);
		a.print().forward().print().forward().last();
	}
}
