package July13;
interface func
{
	int fn(int a, int b);
}
class add
{
	int A(int a, int b)
	{
		return a+b;
	}
}
class sub
{
	int S(int a, int b)
	{
		return a-b;
	}
}
class mul
{
	int M(int a, int b)
	{
		return a*b;
	}
}
class div
{
	int D(int a, int b)
	{   if(b==0)
	   {
		 System.out.println("divide by 0");
		 return 0;
	   }
		return a/b;
	}
}

public class MethodReferenceExercise {
	static int api(func a1) {
		return a1.fn(20,10);
	}
   public static void main(String args[])
   {
	   func a1=new add()::A;
	   func a2=new sub()::S;
	   func a3=new mul()::M;
	   func a4=new div()::D;
	   System.out.println("ADD: "+api(a1));
	   System.out.println("SUB: "+api(a2));
	   System.out.println("MUL: "+api(a3));
	   System.out.println("DIV: "+api(a4));
	   
	  
	   
   }
}
