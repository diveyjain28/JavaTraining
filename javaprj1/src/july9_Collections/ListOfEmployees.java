package july9_Collections;
import java.util.*;
public class ListOfEmployees {
      String name;
      int id;
	public ListOfEmployees(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return name+" "+id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<ListOfEmployees> e=new Vector<ListOfEmployees>();
      ListOfEmployees e1=new ListOfEmployees("A",1);
      e.add(e1);
      System.out.println(e.toString());
      ListOfEmployees e2=new ListOfEmployees("B",2);
      e.add(e2);
      System.out.println(e.toString());
      ListOfEmployees e3=new ListOfEmployees("C",3);
      e.add(e3);
      System.out.println(e.toString());
	}

}
