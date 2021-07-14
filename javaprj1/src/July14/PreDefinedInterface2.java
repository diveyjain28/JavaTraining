package July14;
import java.util.function.*;
//interface Supplier<T>{
//    T get();
//}
public class PreDefinedInterface2 {
	int fn() {
		int x=10;
		x=x*x;
		System.out.println("Supplier function1 gives: " + x);
		return x;
	}
	int fn2() {
		int x=10;
		x=x+x;
		System.out.println("Supplier function2 gives: " + x);
		return x;
	}
	static void fun(Supplier<Integer> s) {
		System.out.println(s.get()); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Supplier<Integer> s=new PreDefinedInterface2() :: fn2;
       fun(s);  
   }
}
