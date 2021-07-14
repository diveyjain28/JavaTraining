package July14;
import java.io.*;
public class Exceptionex7 {
	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	
	}  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	public static void main(String args[]){  
		Exceptionex7 obj=new Exceptionex7(); 
		
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
