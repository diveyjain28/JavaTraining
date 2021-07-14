package July12;
interface Mathop2
{
	int opp(int x,int y);
}
public class LambdaMathop {

	public static void main(String[] args) {
	 Mathop2 a=(x,y)->x+y;
     System.out.println(a.opp(10,20));
     
     Mathop2 b=(x,y)->x-y;
     System.out.println(b.opp(10,20));
     
     Mathop2 c=(x,y)->x*y;
     System.out.println(c.opp(10,20));
     
     Mathop2 d=(x,y)->{
    	 if(y==0)
    		 System.out.println("Not Defined");
    	 else
    	 return x/y;
         return 0;	 
     };
     System.out.println(d.opp(20,10));
   }
}
