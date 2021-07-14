package July12;
interface MathOp{
	int operation(int x, int y);
}
public class anonymousClassExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MathOp add=new MathOp() {
    	   
       public int operation(int x, int y)
       {
    	   return x+y;
       }
	   };
	   System.out.println(add.operation(1, 2));
       
	   MathOp sub=new MathOp() {
    	   
	       public int operation(int x, int y)
	       {
	    	   return x-y;
	       }
		   };
		   System.out.println(sub.operation(1, 2));
	     
		   MathOp mul=new MathOp() {
	    	   
		       public int operation(int x, int y)
		       {
		    	   return x*y;
		       }
			   };
			   System.out.println(mul.operation(1, 2));
		     
			   MathOp div=new MathOp() {
		    	   
			       public int operation(int x, int y)
			       {  
			    	   return x/y;
			       }
				   };
				   System.out.println(div.operation(1, 2));
			     
}
}