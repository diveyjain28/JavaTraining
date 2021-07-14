package first;

public class Prj1Class {
	//function to add two numbers
	public int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		//create an object of Prj1Class
		//use the function
		Prj1Class p=new Prj1Class();
		System.out.println(p.add(1, 2));
	}
}