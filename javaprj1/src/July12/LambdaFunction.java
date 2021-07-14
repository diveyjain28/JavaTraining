package July12;
interface inter{
	void fn();
}
public class LambdaFunction {
	public static void main(String[] arg)
	{
		inter a = () -> System.out.println("Hello");	
		
		a.fn();
		
	}


}
