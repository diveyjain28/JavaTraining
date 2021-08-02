package DesignPatterns;

//Design Pattern Used
//1. Adaptor: ORM class
//2. Singleton: Connection Object
//3. Decorator: getAll() of ORM to decorate Emp
//4. Observer: Main class
//5. Factory method: getConnection()
//6. Abstract Factory: Class.forName()
import java.util.*;
import java.sql.*;
class Emp
{
	private int id;
	private String name;
	private int age;
	public Emp()
	{
	}
	public Emp(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age ;
	}	
}
class ORM{
	Connection con; 
	Statement stmt;
	public ORM(String driver,String url,String user,String pass) throws ClassNotFoundException
	{    try {
		       Class.forName(driver);
		       con=DriverManager.getConnection(url,user,pass);
		      stmt= con.createStatement();
	          }
	     catch(SQLException e)
	          {
		       System.out.println("Error at Initialising");
	          }
	}
	int Save(Emp e){
		String s="Insert into emp values ('"+ e.getId()+"','"+ e.getName()+"','"+ e.getAge()+"')";
		int x=0;
		try {
		      x=stmt.executeUpdate(s);
		    }
		catch(SQLException er)
		{
			System.out.println("Error at Save()");
		}
		return x;
	}	
	int Update(int id,String name, int age){
		
		String s="update emp set age = "+ age + ", name = '" + name+ "' where id = " +id;
		int x=0;
		try {
		      x=stmt.executeUpdate(s);
		    }
		catch(SQLException er)
		{
			System.out.println("Error at Update()");
		}
		return x;
	}	
	int Delete(Emp e){
		String s="Delete from emp where id="+e.getId();
		int x=0;
		try {
		      x=stmt.executeUpdate(s);
		    }
		catch(SQLException er)
		{
			System.out.println("Error at Delete()");
		}
		return x;
	}	
	List<Emp> getAll()
	{
		List<Emp> l=new ArrayList<>();
		try {
		ResultSet rs = stmt.executeQuery("select * from emp");
		while (rs.next()){
		Emp E=new Emp();
		E.setId(rs.getInt(1));
		E.setName(rs.getString(2));
		E.setAge(rs.getInt(3));
		l.add(E);
		}}
		catch(SQLException e)
		{
			System.out.println("Error at getALL()");
		}
		
		return l;
	}
	
}
public class ORMexercise {
public static void main(String args[]) throws ClassNotFoundException
{
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/javadb";
	String user="root";
	String pass="";
	ORM e=new ORM(driver,url,user,pass);
	
	Emp e1=new Emp(105,"TOM",30);
	int r=e.Save(e1);
	System.out.println(r+" Records inserted");
	List <Emp> l1= e.getAll();
	for(int i=0;i<l1.size();i++)
		System.out.println(l1.get(i).toString());
	
	int u=e.Update(105,"Divey",22);
	System.out.println(u+" Records updated");
	List <Emp> l2= e.getAll();
	for(int i=0;i<l2.size();i++)
		System.out.println(l2.get(i).toString());
	
	int d=e.Delete(e1);
	System.out.println(d+" Records deleted");
	List <Emp> l3= e.getAll();
	for(int i=0;i<l3.size();i++)
		System.out.println(l3.get(i).toString());
}
}
