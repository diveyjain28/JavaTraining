package july7;
class Employee
{
	int Eid;
	String Ename;
	String Paid_amount;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getPaid_amount() {
		return Paid_amount;
	}
	public void setPaid_amount(String paid_amount) {
		Paid_amount = paid_amount;
	}
	
}
class WagesEmp extends Employee
{{
	super.setPaid_amount("hourly Wages");
}
}
class SalaryEmp extends Employee
{    //Employee e=new Employee();
{super.setPaid_amount("Monthly Salary");
}
}
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new WagesEmp();
		Employee f=new SalaryEmp();
		e.setEid(1);
		e.setEname("AAAA");
		f.setEid(2);
		f.setEname("BBBB");
		System.out.println("ID:"+e.getEid()+", NAME:"+e.getEname()+", WAGES:"+e.getPaid_amount());
		System.out.println("ID:"+f.getEid()+", NAME:"+f.getEname()+", WAGES:"+f.getPaid_amount());
		

	}

}
