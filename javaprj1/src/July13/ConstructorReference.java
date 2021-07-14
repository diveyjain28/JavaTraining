package July13;
interface Ab
{
	void fn(int x);
}
class Bb{ //case 4: constructor reference
 Bb(int x){
	 System.out.println("Inside the constructor "+x);
 }
}
public class ConstructorReference {
	public static void main(String[] ar) {
		Ab a = Bb :: new;
		a.fn(10);
	}
}
