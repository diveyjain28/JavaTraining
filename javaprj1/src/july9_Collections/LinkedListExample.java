package july9_Collections;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();
        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");	        friends.add("John");
        friends.add("David");	        friends.add("Chris");
        System.out.println("Initial LinkedList : " + friends);
         friends.add(3, "Lisa"); // Adding at the specified position in the LinkedList
        System.out.println("After add(3, \"Lisa\") : " + friends);
        friends.addFirst("Steve"); // Adding an element at the beginning of the LinkedList
        System.out.println("After addFirst(\"Steve\") : " + friends);
        friends.addLast("Jennifer"); // Add at end of the LinkedList (equivalent to the add() )
       
System.out.println("After addLast(\"Jennifer\") : " + friends);
        List<String> familyFriends = new ArrayList<>(); 
        familyFriends.add("Jesse");	
        familyFriends.add("Walt");
        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
    }
}
