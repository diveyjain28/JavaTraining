package July12;
import java.util.*;

public class forEachLambda {
	
	    public static void main(String[] args) {
	        List<String> items = new ArrayList<>();
	        items.add("coins");
	        items.add("pens");
	        items.add("keys");
	        items.add("sheets");
	        //List <String> atom=Arrays.asList("hi","hello","huihui");
	        items.forEach((String name) -> {
	            System.out.println(name);
	        });
	        }
}
