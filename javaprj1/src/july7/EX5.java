package july7;

public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuffer sb=new StringBuffer("nitin");
      StringBuffer temp=new StringBuffer(sb);
      temp.reverse();
     System.out.println(sb);
      System.out.println(temp);
      if(sb.toString().equals(temp.toString()))
    	  System.out.println("It is a Palindrome");
      else
    	  System.out.println("It is not a Palindrome");
      
	}

}
