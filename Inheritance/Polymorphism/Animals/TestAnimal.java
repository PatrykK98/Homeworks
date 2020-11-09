package Polymorphism;

public class TestAnimal {
public static void main(String[] args) {
	Animals Dog = new Dog("Max", 6);
	Animals Cat =new Cat("Grusia", 2);

	System.out.println(Dog.getName());
	Dog.agePrinter();
	System.out.println(Dog.ageCounter());
	String[] toys = { "thread", "ball", "rubber bone", "fake mouse"};
	Dog.toyGame(toys);

	System.out.println("==============================");
	
	System.out.println(Cat.getName());
	Cat.agePrinter();
	System.out.println(Cat.ageCounter());
	Cat.animalSound("mial",7);

}
}
