package July14;
//interface Consumer<T>{
//    void accept(T obj);
//}
import java.util.function.Consumer;
public class PreDefinedInterface {
	void fn(int x) {
		x=x*x;
		System.out.println("Consumer function1 gives: " + x);	
	}
	void fn2(int x) {
		x=x+x;
		System.out.println("Consumer function2 gives: " + x);	
	}
	
	void fun(Consumer<Integer> c) {
		c.accept(100);
	}
   public static void main(String args[]) {
       Consumer<Integer> c= new PreDefinedInterface()::fn;
       Consumer<Integer> c2= new PreDefinedInterface()::fn2;
       new PreDefinedInterface().fun(c);  //10000
   }
}
