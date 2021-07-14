package July13;
interface AA
{
	int fn(int x);
}
class BB{
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class CC{
	int display(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
public class MethodReference {
	
		static void api(AA a1) {
			System.out.println(a1.fn(10));
		}
		public static void main(String[] ar) {
			AA a1=new BB()::print;
			
			AA a2= new CC() :: display;
			
		
			
			api(a1); //a1.fn()->b.print()
			api(a2);  //a2.fn() -> C.display()
		}
}
