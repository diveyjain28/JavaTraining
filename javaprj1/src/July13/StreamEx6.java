package July13;
import java.util.*;
import java.util.stream.Stream;
public class StreamEx6 {
	public static void main(String args[]) {
		List<String> items = new ArrayList<>();

        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");
        items.add("");
		System.out.println(items.stream().filter(item->(item.length()==0)).count());
         
		
		List<String> gadgets = new ArrayList<>(); 
		gadgets.add("SmartPh"); 
		gadgets.add("SmartWatch"); 
		gadgets.add("SmartTV"); 
		gadgets.add("iPhone"); 
		// using lambda expression and stream methods 
		String item = gadgets.stream() 
				.peek(s -> System.out.println("processing: " + s)) 
				.filter(s -> s.length() > 8) .findFirst().orElse(""); 
		System.out.println("In Java 8, first item: " + item); 
		
	}
}
