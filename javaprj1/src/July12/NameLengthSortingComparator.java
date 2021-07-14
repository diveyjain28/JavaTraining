package July12;
import java.util.*;
 class exercise1 implements Comparable<exercise1>
{
	public String name;

	exercise1(String n) {
		name = n;
	}
	public int compareTo(exercise1 d) {
		return this.name.length()-d.name.length();
	}
}
public class NameLengthSortingComparator {
	public static void main(String args[]) {
		List<exercise1> list = new ArrayList<exercise1>();
		list.add(new exercise1("dd"));
		list.add(new exercise1("ccc"));
		list.add(new exercise1("bbbb"));
		list.add(new exercise1("aaaaa"));	
		Collections.sort(list);
		for (exercise1 a : list)
			System.out.print(a.name + ", ");
		}
	  
}
