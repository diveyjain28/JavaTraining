package first;

public class EX3 {
	private	String name;
	private int sal;
	//Behavior Abstracted Data
	public void getData(String nm, int s) {
		name = nm;
		sal = s;
	}
	public void print() {
		System.out.println("Name : \"" +name+ "\" Salary : " + sal +"\n");
	}
	public static void main(String args[])
	{
		EX3 e=new EX3();
		e.getData("Divey",1);
		e.print();
		
	}
}
