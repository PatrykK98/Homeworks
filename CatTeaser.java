
public class CatTeaser {
	public static void main(String[] args) {
		Cat2 tom = new Cat2("Tom");

		tom.isHungry();
		tom.eat("milk");
		tom.eat("mouse");
		tom.sleep(5);
		tom.isHungry();
		tom.eat("mouse");
		tom.isHungry();
		tom.play("ball");
		
		

	}
}