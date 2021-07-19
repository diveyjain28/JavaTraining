package July15;
import java.util.*;
class DuplicateName extends Exception{  
	DuplicateName(String s){  
	  super(s);  
	 }  
	}  
class Age extends Exception{  
	Age(String s){  
	  super(s);  
	 }  
	}  
public class ExceptionExercise {
	static List<String> name=new ArrayList();
	int age;
	void check(String name,int age) throws DuplicateName ,Age
	{
		ExceptionExercise E=new ExceptionExercise();
		 
		for(int i=0;i<E.name.size();i++)
		{ 
			if(E.name.get(i).equals(name))
			{   
				throw new DuplicateName("Duplicate names are not allowed as Employees");
			}
		}
		if(age<18)
			throw new Age("Children are not allowed as Employees");
		else if(age<0)
			throw new Age("Ghosts are not allowed as Employees");
		else if(age>60)
			throw new Age("Seniors are not allowed as Employees");
		else if(age>100)
			throw new Age("Purvaj are not allowed as Employees");
		else
			{
			E.name.add(name);
			E.age=age;
			System.out.println("Employee added successfully");
			}
	}
public static void main(String args[])
{   ExceptionExercise E=new ExceptionExercise();
	try {
		E.check("Divey",22);
		E.check("AAAA",22);
		E.check("BBBB",22);
		E.check("Divey",22);
	}
	catch(DuplicateName d)
	{
		System.out.println(d.getMessage());
	}
	catch(Age a)
	{
		System.out.println(a.getMessage());
	}
}
}
