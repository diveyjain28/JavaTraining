package IO;
import java.io.*;
public class CopyExercise {
	public static void copy(String from_name, String to_name) throws IOException {
		File from_file = new File(from_name);
		File to_file = new File(to_name);
		
		
		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(from_file);
			to = new FileOutputStream(to_file);
			byte[] buffer = new byte[4096];
			int bytes_read;
while ((bytes_read = from.read(buffer)) != -1)
				to.write(buffer, 0, bytes_read);
		} finally {
			if (from != null || to != null)
				try {
					from.close();
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}
	public static void main(String[] args) {
		if ((args.length != 1) )
			System.err.println("Invalid number of arguments");
		else if( (args[0].substring(0, (args[0].length()-5)).equals(".java")  ) )
              System.out.println("Source file is not .java file");
		else {
			try {
				copy(args[0], args[0].substring(0, (args[0].length()-5))+ ".clas");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
}
}
