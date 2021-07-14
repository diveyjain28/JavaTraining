package july9_Collections;


import java.util.*;
class ArrayListExample {
   public static void main(String[] args)     {
       // Creating a an ArrayList with String specified
       ArrayList <String> al = new ArrayList<String> ();
        al.add("Sachin");
       al.add("Rahul");
        // Typecasting is not needed 
       String s1 = al.get(0);
       String s2 = al.get(1);
       System.out.println(s1);
       System.out.println(s2);
       
   }
}
