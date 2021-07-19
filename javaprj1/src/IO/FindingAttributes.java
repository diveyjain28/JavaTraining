package IO;
import java.io.IOException;
import java.nio.file.*;
public class FindingAttributes {
	public static void main(String[] args) {
		 Path sourcePath = Paths.get("D:/IOexamples/test.txt");
		// Path destinationPath = Paths.get("D:/IOexamples/test2.txt");
		 try {
		     System.out.println(Files.isReadable(sourcePath));
		     
		 } catch(Exception e) 
		 { 
			 
		 }
  }	
}
