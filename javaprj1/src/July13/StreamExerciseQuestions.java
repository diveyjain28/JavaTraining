package July13;
import java.util.stream.Stream;
import java.util.*;
public class StreamExerciseQuestions {
	public static void main(String[] args) {
	       ArrayList<String> arr= new ArrayList(Arrays.asList("HI", "HELLO", "HEY", "JAVA"));
           List<Integer> numbers = Arrays.asList(1, 2,2, 3, 4, 5, 6, 7);
           
           System.out.print("Squares:");
	       numbers.stream().distinct().forEach(n -> System.out.print((int)Math.pow(n, 2)+" "));
	       System.out.println();
	       System.out.println("No. Of Empty Strings:"+arr.stream().filter(item->(item.length()==0)).count());
	       System.out.println("MAX:"+numbers.stream().max(Integer::compare).get());
	       System.out.println("MIN:"+numbers.stream().min(Integer::compare).get());
	       int sum=numbers.stream().reduce(0,Integer::sum);
	       System.out.println("SUM:"+sum);
	       System.out.println("AVG:"+sum/numbers.size());
	       
	     }
	
}
