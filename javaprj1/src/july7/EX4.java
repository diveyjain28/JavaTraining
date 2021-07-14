package july7;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   String str="nitin";
	   int top=str.length()-1,flag=1;
	   for(int i=0;i<str.length()/2;i++)
	   {
		   if(str.charAt(i) !=str.charAt(top))
		   {
			   flag=0;
			   break;
		   }
		   top--;
	   }
	   if(flag==1)
		   System.out.println("It is a palindrome");
	   else
		   System.out.println("It is not a palindrome");
	}

}
