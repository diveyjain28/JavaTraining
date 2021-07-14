package July13;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class StreamPeek {
	public static void main(String args[]) {
	      Stream<String> words = Stream.of("lower", "case", "text");
	List<String> list = words
	    .peek(s -> System.out.println(s))
	    .map(s -> s.toUpperCase())
	    .collect(Collectors.toList());
	System.out.println(list);
	   }
}
