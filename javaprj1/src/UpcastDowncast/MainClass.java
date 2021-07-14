package UpcastDowncast;

public class MainClass {   
	   public static void main(String args[]) {
	       
		 //upcasting Child to parent
		   Dog dog = new Dog();
	       //Mammal anim1 = new Dog();
	       Mammal anim1 = (Mammal) dog;
	       anim1.eat(); //Dog is eating…
	       
	       Mammal anim3 = new Dog();
	       anim3.eat(); //Dog is eating…
	      //anim3.bark();
	       
	      
	       
	       //downcasting Parent to child
	       Mammal anim2 = new Cat();
	       Cat cat = (Cat) anim2;
	       anim2.eat(); //Eating…
	       cat.meow(); //Meow Meow!
	       
	       
	       Dog dog1 = new Dog();
	       Cat cat1 = new Cat();
	 
	       AnimalTrainer trainer = new AnimalTrainer();
	       trainer.teach(dog1);
	       trainer.teach(cat1);

	      
	   }
	}