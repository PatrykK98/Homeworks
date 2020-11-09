package Polymorphism;

public class Cat extends Animals {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public int ageCounter() {
		System.out.println("For cats years it is: ");
		return age=getAge()*9;
		
	}
	
	public void animalSound(String sound, int time) {
		System.out.println("Cat "+super.getName()+" makes "+sound+" for "+time+" minutes");
	}
}
