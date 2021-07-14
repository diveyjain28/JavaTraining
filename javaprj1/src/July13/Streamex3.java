package July13;
import java.util.*;
public class Streamex3 {
	public static void main(String args[]) {
	      List<String> list = Arrays.asList("Java", "is", "not", "great", "now");
	list.stream()
	    .filter(s -> !s.startsWith("n"))
	    .map(String::toUpperCase)
	    .forEach(s -> System.out.print(s + " "));
	   }
}
