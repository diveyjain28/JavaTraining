package July13;

import java.util.stream.Stream;
import java.util.*;
public class LengthOfStringsIndiviuallyStreams {
	public static void main(String args[]) {
		ArrayList<String> arr= new ArrayList(Arrays.asList("a", "ab", "abc", "abcd"));
	       arr.stream()
	          .map(String::length)
	          .forEach(System.out::println);
	}
}
