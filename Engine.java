
public class Engine {
	public static String name;
	public static int horsepower;
	public static double capacity;
	public static boolean isStarted=false;
	
	public Engine(String name, int horepower, int capacity) {
		this.name=name;
		this.horsepower=horsepower;
		this.capacity=capacity;
	}
	
	public boolean getisStarted() {
		return isStarted;
	}
	
	public static int maxSpeed() {
		int maxspeed=horsepower*2;// dont't know how to take amount of horsepower from created object "diesel". Or dont know how to count maxspeed of the car
		return maxspeed;
	}
	public String getName() {
		return name;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
}
