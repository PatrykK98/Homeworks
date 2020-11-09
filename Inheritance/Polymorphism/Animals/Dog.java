package Polymorphism;

import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animals {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public int ageCounter() {
		System.out.println("For dogs years it is: ");
		return age=super.getAge()*7;	
	}
	
	public void toyGame(String [] toys) {
		int random = ThreadLocalRandom.current().nextInt(0, 3);
		int j =random;
		System.out.println(super.getName()+" is playing "+toys[j]);
	}
	
}
