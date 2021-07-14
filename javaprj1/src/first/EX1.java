package first;
import java.util.*;
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     student s=new student();
     s.readName();
     s.DisplayName();
	}

}
class student{
	private int stud_id;
	private String stud_name;
	Scanner s=new Scanner(System.in);
	public void readName()
	{
		//System.out.print("Enter the student id:");
		//stud_id=s.nextInt();
		//s.nextLine();
		System.out.print("Enter the student name:");
		stud_name=s.nextLine();
		
	}
	public void DisplayName()
	{
		//System.out.println("ID:"+stud_id);
		System.out.println("Name:"+stud_name);
		
	}
}
