
public class Cat2 {
	private String name;
	private boolean isHungry=true;
	
	
	

	public Cat2(String name) {
		this.name = name;
	}

	public void eat(String food) {
		if(isHungry == true) {
		System.out.println(name + " is eating " + food);
		isHungry=false;
		}else {
			isHungry();
		}
		
	}

	public void play(String toy) {
		System.out.println(name + " is playing with " + toy);
	}

	public void sleep(int hour) {
		System.out.println(name + " is going to sleep for " + hour+" hours");
		isHungry=true;
	}

	public void isHungry() {
		if(isHungry == true) {
			System.out.println(name+" is hungry");
			}else {
			System.out.println(name+" is not hungry");
		}
	}
	
	public String getName() {
		return name;
	}
	public boolean getisHungry() {
		return isHungry;
	} 
	
}
