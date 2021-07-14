package July13;


import java.util.stream.Stream;
import java.util.*;
public class StreamToLower {
	public static void main(String[] args) {
	       ArrayList<String> arr= new ArrayList(Arrays.asList("HI", "HELLO", "HEY", "JAVA"));
	       arr.stream()
	          .map(String::toLowerCase)
	          .forEach(System.out::println);
	    		  
	     }
}

