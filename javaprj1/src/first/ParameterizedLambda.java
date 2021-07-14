package first;



interface Lambda{ //case 1
	void fn(int x,String s);
}

class ParameterizedLambda{
	public static void main(String[] arg)
	{
		//A a = (int x) -> System.out.println("Hello" + x);	
		Lambda a = (y,z) -> System.out.println("Hello" + (y*10) + z);	
		a.fn(10,"Hi");
		
	}
}