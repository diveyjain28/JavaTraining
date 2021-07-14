package July12;


import java.util.*;

class Emp1 implements Comparable<Emp1> {
	public String name;
	public int age;

	Emp1() {
	}

	Emp1(String n, int a) {
		name = n;
		age = a;
	}

	// Overriding the compareTo method
	public int compareTo(Emp1 d) {
		return (this.name).compareTo(d.name);
	}

	// Overriding the compare method to sort the age
	
}
class A implements Comparator<Emp1>{
	public int compare(Emp1 d, Emp1 d1) {
		return d.age - d1.age;
	}
}

public class ComparatorExample2 {
	public static void main(String args[]) {
		List<Emp1> list = new ArrayList<Emp1>();
		list.add(new Emp1("Ram", 23));
		list.add(new Emp1("Rohan", 22));
		list.add(new Emp1("Roy", 30));
		list.add(new Emp1("Tom", 24));
		Collections.sort(list);// Sorts the array list
for (Emp1 a : list)
			System.out.print(a.name + ", ");
		Collections.sort(list, new A()); // Sorts the array list using comparator
		System.out.println(" \n\n\nSorted According to Age\n\n");
		for (Emp1 a : list)// printing the sorted list of ages
			System.out.print(a.name + " : " + a.age + ", ");
	}
}