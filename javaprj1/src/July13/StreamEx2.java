package July13;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamEx2 {
	public static void main(String[] args) {
		System.out.println("The stream after applying the function is : ");
		List<String> list = Arrays.asList("java", "world", "j", "a", "v", "a");
		// Using Stream map(Function mapper) to convert the Strings in stream to
		// UpperCase form
		
		list.stream().map(String::toUpperCase).distinct().forEach(System.out::println);		
		List <String>l=list.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());	
		System.out.println(l);
		}
}
