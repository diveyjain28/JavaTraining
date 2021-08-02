package DpendencyInjection;

class Restaurant {
	iHotDrink HD;
	void order(iHotDrink h)
	{
		HD=h;
	}
	public void serve() {
		HD.served();
	}
}
interface iHotDrink{
	 void served();
}
class Tea implements iHotDrink {
	public void served() {
		System.out.println("Tea is served");
	}
}
class Coffee implements iHotDrink {
	public void served() {
		System.out.println("Coffee is served");
	}
}

		
public class Main {
	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		r.order(new Tea());
		r.serve();
		r.order(new Coffee());
		r.serve();
	}
}