package IO;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileWriterExercise {
	public static void main(String args[])
	{
Scanner s=new Scanner(System.in);
String name=s.nextLine();
File file = new File("D://IOexamples/Name_Collections.txt");
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
Date date = new Date();  
try {
     FileWriter writer = new FileWriter(file, true);
     writer.write(name + " " + "Login Time: " + formatter.format(date) + "\n");
     writer.flush();
     writer.close();
}
catch(IOException e)
{
	System.out.println(e);
}
System.out.println("Hello " + name);
}
}
