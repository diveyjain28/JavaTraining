package July15;
import java.io.*;
public class AutoClosableResourse {
	public static void main(String[] args) {
	     try(BufferedReader br=new BufferedReader(new FileReader("D:\\test.txt")))         {
	            String str;
	            while((str=br.readLine())!=null)   {
	                   System.out.println(str);
	             }
	      }
	     catch(IOException ie)
	     {  System.out.println("exception");  }
	  }
}

