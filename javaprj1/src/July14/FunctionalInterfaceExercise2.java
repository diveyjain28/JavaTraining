package July14;
import java.util.*;
import java.util.function.*;
public class FunctionalInterfaceExercise2 {
	public static void main(String[] args)
	{
	BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
	BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
	BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
	BiFunction<Integer,Integer,Integer> div=(a,b)->(b==0?-1:a/b);
	
	System.out.println("Add: 10,20: "+add.apply(10,20));
	System.out.println("Sub: 10,20: "+sub.apply(10,20));
	System.out.println("Mul: 10,20: "+mul.apply(10,20));
	System.out.println("Div: 10,20: "+div.apply(10,20));
	
	}
}
