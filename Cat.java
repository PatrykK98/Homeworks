
public class Cat {
	private String name;
	private boolean isHungry = true;
	private String food;
	private int hour;
	private String toy;
	private int meals = 0;

	public Cat(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}

	public void play(String toy) {
		System.out.println(name + " is playing with " + toy);
	}

	public void sleep(int hour) {
		System.out.println(name + " is going to sleep for " + hour+" hours");
	}

	public String getName() {
		return name;
	}

	public String getFood() {
		return food;
	}

	public String getToy() {
		return toy;
	}

	public boolean isHungry() {
		return isHungry;
	}
	public void Tommy(boolean isHungry) {
		if(isHungry){
			System.out.println(name+" is hungry");
		}else {
			System.out.println(name+" is not hungry");
		}
	}

	public int getHour() {
		return hour;
	}
}
