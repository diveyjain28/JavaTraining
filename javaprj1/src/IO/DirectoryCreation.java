package IO;
import java.io.*;
public class DirectoryCreation {
	 public static void main(String args[]) {
	      String dirname = "D://IOexamples/mkdir";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      d.mkdirs();
	      System.out.println("Dirs Created ..");
	   }
}
