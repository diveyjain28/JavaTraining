package July14;
import java.util.function.*;
//interface Predicate<T>{
//    Boolean test(T);
//}
public class PredicateFunction {
	Boolean fn(int x) {
		return x>7;
	}
	static void fun(Predicate<Integer> p, int x) {
		System.out.println(p.test(x)); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Predicate<Integer> p=new PredicateFunction() :: fn;
      fun(p, 10); //true
      fun(p, 3); //false
   }
}   
