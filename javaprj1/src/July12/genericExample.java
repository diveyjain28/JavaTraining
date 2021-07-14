package July12;
import java.util.*;
@SuppressWarnings("hiding")
class library<Book, Video, Newspaper>
{
	List<Book> obj1;
	List<Video> obj2;
	List<Newspaper> obj3;
	public List<Book> getObj1() {
		return obj1;
	}
	public void setObj1(List<Book> obj1) {
		this.obj1 = obj1;
	}
	public List<Video> getObj2() {
		return obj2;
	}
	public void setObj2(List<Video> obj2) {
		this.obj2 = obj2;
	}
	public List<Newspaper> getObj3() {
		return obj3;
	}
	public void setObj3(List<Newspaper> obj3) {
		this.obj3 = obj3;
	}
	
	
}

class Book{
	private String name;
	private int code;
	
	public Book(String name, int code) {
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		return name+" "+code; }
	
	
}

class Video{
	private String name;
	private int code;
	
	public Video(String name, int code) {
		this.name = name;
		this.code = code;
	}
	@Override
	public String toString() {
		return name+" "+code; 
	
}

class Newspaper{
	private String name;
	private int code;
	
	public Newspaper(String name, int code) {
		this.name = name;
		this.code = code;
	}
	@Override
	public String toString() {
		return name+" "+code; 
	
}}

public class genericExample {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		List<Book> b=new ArrayList<Book>();
		b.add(new Book("Book1",1));
		b.add(new Book("Book2",2));
		
		List<Video> v=new ArrayList<Video>();
		v.add(new Video("Video1",1));
		v.add(new Video("Video2",2));
		
		List<Newspaper> n=new ArrayList<Newspaper>();
		n.add(new Newspaper("Newspaper1",1));
		n.add(new Newspaper("Newspaper2",2));
		
		library <Book, Video, Newspaper>l=new library<Book, Video, Newspaper>();
	    l.setObj1(b);
	    l.setObj2(v);
	    l.setObj3(n);
	    
	    System.out.println(l.getObj1().toString());
	    System.out.println(l.getObj2().toString());
	    System.out.println(l.getObj3().toString());
		
		

	}

}}
