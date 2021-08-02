package MultiThreading;
//Implement a ProducerConsumer class using synchronized, wait(), and notify() in Java.
//Producer Produces :
//Other producers can also produce
//None of the Consumers can consume
//Consumer Consumes :
//Other Consumers can also consume
//None of Producers can produce.
class ProducerConsumer
{
	public synchronized void produces() {
		System.out.println("Producer Produces");
		
	}
	public synchronized void consumes() {
		System.out.println("Consumer consumes");
		
	}
}
class producer implements Runnable {
	
	ProducerConsumer p;
	public producer(ProducerConsumer p)
	{
		this.p=p;
	}

	public void run() {
		p.produces();
	}
}
class consumer implements Runnable {
	
	ProducerConsumer c;

	public consumer(ProducerConsumer c)
	{
		this.c=c;
	}
	public void run() {
		c.consumes();
	}
}
public class ProducerConsumerExercise {
public static void main(String args[])
{
	
	ProducerConsumer pc=new ProducerConsumer();
	Thread t11 = new Thread(new consumer(pc));
	Thread t12 = new Thread(new producer(pc));
	for(int i=0;i<10;i++)
	t11.run();
	for(int i=0;i<10;i++)
	t12.run();
	
}
}
