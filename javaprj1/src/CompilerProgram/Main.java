package CompilerProgram;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="import java.util.*;"
				+ "class JavaExample{  "
				+ "public static void main(String args[]){  \r\n"
				+ "    ArrayList<String> alist=new ArrayList<String>();  \r\n"
				+ "    alist.add(\"Gregor Clegane\");  \r\n"
				+ "     alist.add(\"Khal Drogo\");  \r\n"
				+ "    //iterating ArrayList\r\n"
				+ "     for(String str:alist)  \r\n"
				+ "        System.out.println(str);  \r\n"
				+ "     } }";
				

      Stack<String> first = new Stack<>();
      Stack<String> second = new Stack<>();
      Stack<String> third = new Stack<>();
      
      for(int i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)=='(')
    		  first.push("(");
    	  else if(str.charAt(i)=='{')
    		  second.push("{");
    	  else if(str.charAt(i)=='[')
    		  third.push("[");
    	  else if(str.charAt(i)==')')
    		  first.pop();
    	  else if(str.charAt(i)=='}')
    		  second.pop();
    	  else if(str.charAt(i)==']')
    		  third.pop();
      }
      if(first.size()==0&&second.size()==0&&third.size()==0)
      {
    	  System.out.println("The Program will compile");
      }
      else
      {
    	  System.out.println("The Program won't compile");
      }
	}

}
