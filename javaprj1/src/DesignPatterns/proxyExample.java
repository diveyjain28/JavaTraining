package DesignPatterns;
class A{
	int x;
	int get() {
		return x;
	}
	void set(int x) {
		this.x=x;
	}
	
}
class proxyA{
	A a;
	public proxyA()
	{
		a=new A();
	}
	int get() {
		return a.get();
	}
	void set(int x) {
		a.set(x);
	}
	
}
public class proxyExample {
	public static void main(String args[]) {
		proxyA a=new proxyA();
		a.set(10);
		System.out.println(a.get());
	}
}
