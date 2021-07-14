package July14;
import java.io.*;  
//If the superclass method does not declare an exception
//* Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.

class Parent1{  
  void msg(){System.out.println("parent");}  
}  

public class ExceptionExample9 extends Parent1 {
	void msg()throws ArithmeticException{  
	    System.out.println("child");  
	  }  
	public static void main(String args[]){  
		   Parent1 p=new ExceptionExample9();  
		   p.msg();  
		  }  
		} 

