package IO;

public class stdioExample {
	public static void main(String args[])  {
		   for(String s : args) {
			   System.out.println(s);
		   }
		   System.out.println("First arg is: "+ args[0]);
		   System.out.println("No of args : "+ args.length);
		 } 
}
