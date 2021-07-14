package July13;
interface A
{
	int fn(int x);
}
class D implements A
{
	public int fn(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class E implements A
{
	public int fn(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
//class B{
//	int print(int x) {
//		System.out.println("This is a printing process");
//		return x*x;
//	}
//}
//class C{
//	int display(int x) {
//		System.out.println("This is a displaying process");
//		return (int) Math.random();
//	}
//}
public class MethodChaning {
	static void api(A a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
//		A a1= x -> new B().print(x);
//		
//		A a2= new C() :: display;
		
		A a1=new D();
		A a2=new E();
		
		api(a1); //D.fn()
		api(a2);  //E.fn()
	}
}
