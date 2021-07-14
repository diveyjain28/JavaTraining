package July12;

public class ex1 {
	public static void main(String[] ar) {
		Ab a=new Ab() {
			public int fn() {
				return new Bc().print();
			}
		};
		Ab a1= () -> new Bc().print();
		System.out.println(a.fn());
		System.out.println(a1.fn());
		
	}
}
interface Ab
{
	int fn();
}
class Bc{
	int print() {
		System.out.println("This is a printing process");
		return 10;
	}
}
