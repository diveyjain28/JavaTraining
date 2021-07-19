//A resource is an object in a program that must be closed after the program has finished.
//Any object that implements java.lang.AutoCloseable or java.io.Closeable can be passed as a parameter to try statement.
//All the resources declared in the try-with-resources statement will be closed automatically when the try block exits. There is no need to close it explicitly.
//We can write more than one resources in the try statement.
//In a try-with-resources statement, any catch or finally block is run after the resources declared have been closed.
package July15;
class MyAutoClosable implements AutoCloseable {
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }
    @Override
    public void close() {//throws Exception {
        System.out.println("MyAutoClosable closed!");
    }
}
public class AutoClosable {
	 public static void main(String args[]){      
	       // Using try-without-resources  
		 try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
             myAutoClosable.doIt();
//	         try{
//	        	 MyAutoClosable myAutoClosable = new MyAutoClosable();
//	               myAutoClosable.doIt();}
//	               if(3>2)
//	                 throw new Exception("OH no!");
//	        	 myAutoClosable.close();
//	          }
//	         catch(Exception exception){  
//	              System.out.println(exception);  
//	          }     
	      }      
}}
