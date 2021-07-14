package July14;
import java.util.*;
import java.util.function.*;
public class FunctionalInterfaceExercise1 {
	Integer fn(String x) {
		return x.length();
	}
	static void fun(Function<String, Integer> f, String x) {
		System.out.println("Length of String :"+f.apply(x)); 
	}
 public static void main(String args[]) {
	 Function<String, Integer> f=new FunctionalInterfaceExercise1 ():: fn;
    fun(f, "Divey"); 
    
 }
}
