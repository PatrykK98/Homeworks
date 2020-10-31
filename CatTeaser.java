
public class CatTeaser {
	public static void main(String[] args) {
		Cat tom = new Cat("Tom");

		System.out.println(tom.getName() + " is hungry? " + tom.isHungry());
		tom.eat("milk");
		System.out.println(tom.getName() + " is hungry? " + !tom.isHungry());
		tom.sleep(5);
		System.out.println(tom.getName() + " is hungry? " + tom.isHungry());
		tom.eat("mouse");
		System.out.println(tom.getName() + " is hungry? " + !tom.isHungry());
		tom.play("ball");
		
		System.out.println("------------");
		
		tom.Tommy(tom.isHungry());
		tom.eat("milk");
		tom.Tommy(!tom.isHungry());
		tom.sleep(5);
		tom.Tommy(true);		// By using Tommy() I dont need variable isHungry at all...
		tom.eat("mouse");
		tom.Tommy(false);
		tom.play("Hotwheels");
		

	}
}