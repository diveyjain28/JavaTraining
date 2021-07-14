package july9_Collections;


public class genericEmoloyee<T> {
          private T name;      
	      private int empid;
          public void addEmp(T name,int id)
          {
        	  this.name=name;
        	  this.empid=id;
          }
          public void showEmp()
          {
        	  System.out.println(name);
        	  System.out.println(empid);
          }
	public static void main(String[] args) {
		genericEmoloyee<String> g=new genericEmoloyee<String>();
		g.addEmp("DIVEY", 1);
		g.showEmp();
	}
}
