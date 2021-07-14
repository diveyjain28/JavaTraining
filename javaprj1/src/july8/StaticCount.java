package july8;
import java.util.*;
public class StaticCount {
    static int count=0;
    public StaticCount()
    {
    	count++;
    }
    public static void NO_EMP()
    {
    	System.out.println("COUNT="+count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int ch=0;
     Scanner s=new Scanner(System.in);
     while(ch!=3)
     {
    	 System.out.println("Press 1 to Add Employee.");
    	 System.out.println("Press 2 to Display count of Employee");
    	 System.out.println("Press 3 to EXIT");
    	 System.out.println("ENTER YOUR CHOICE:");
    	 ch=s.nextInt();
    	 if(ch==1)
    	 {
    		 StaticCount sc=new StaticCount();
    		 
    	 }
    	 else if(ch==2)
    	 {
    		 NO_EMP();
    	 }
    	 else if(ch==3)
    	 {
    		 System.out.println("BYE");
    	 }
    	 else
    	 {
    		 System.out.println("WRONG INPUT");
    	 }
     }
	}

}
