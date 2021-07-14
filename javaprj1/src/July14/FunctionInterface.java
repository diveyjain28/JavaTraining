package July14;
import java.util.function.*;
//interface Function<T,R>{
//    R apply(T);
//}
public class FunctionInterface {
	Boolean fn(int x) {
		return x>7;
	}
	static void fun(Function<Integer, Boolean> f, int x) {
		System.out.println(f.apply(x)); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Function<Integer, Boolean> f=new FunctionInterface() :: fn;
      fun(f, 10); //true
      fun(f, 3); //false
   }
}
