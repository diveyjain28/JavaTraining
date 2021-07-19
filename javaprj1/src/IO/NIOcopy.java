package IO;
import java.io.IOException;
import java.nio.file.*;
public class NIOcopy {
	public static void main(String[] args) {
		 Path sourcePath = Paths.get("D:/IOexamples/test.txt");
		 Path destinationPath = Paths.get("D:/IOexamples/test2.txt");
		 try {
		     Files.copy(sourcePath, destinationPath);
		     System.out.println("Done");
		 } catch(Exception e) { }
   }	
}
