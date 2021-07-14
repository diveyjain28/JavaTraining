package July13;
import java.util.Random;

interface AAA
{
	int fn(int x);
}
class BBB{ //existing class
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}

	
}
class CCC{ //static method
	static int display(int x) {
		System.out.println("This is a displaying process");
		return (int) new Random().nextInt(10-1) + 1;
	}
}
public class MethodRefernceAll {
	static void api(AAA a) {
		System.out.println(a.fn(100));
	}
	public static void main(String[] ar) {
		AAA a1=new BBB() :: print; //instance method
		
		
		AAA a2= CCC :: display;  //static
		AAA a3= Integer :: numberOfTrailingZeros; //arbitrary Object
		//static int	numberOfTrailingZeros(int i)
		//Returns the number of zero bits following the lowest-order ("rightmost") 
		api(a1); //a1.fn()->b.print()
		api(a2);  //a2.fn() -> C.display()
		
api(a3); //a3.fn()-> Integer.numberOfTrailingZeros()

	}
}
