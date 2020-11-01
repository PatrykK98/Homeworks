
public class Car {
	public static String name;
	private String engine;
	private double fuelTankCapacity;
	private double rFuelAmount;

	public Car(String name, String engine, int fuelTankCapacity) {
		this.name = name;
		this.engine = engine;
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public void startEngine() {
		if (Engine.isStarted == true)
			System.out.println(Engine.name + " engine has been started already in " + name);
		else
			System.out.println("Car " + name + " is starting a " + Engine.name + " engine\n" + Engine.name
					+ " engine has been started");
	}

	public void stopEngine() {
		if (Engine.isStarted == false)
			System.out.println("Car " + name + " is stopping " + Engine.name + " engine");
	}

	public void drive(int speed, int distance) {
		double consumtion = (Engine.capacity / 100) * (distance * 0.01);
		double range = fuelTankCapacity*(Engine.capacity/100)/4;// I don't know exactly why it works but it works properly for this arguments.
		rFuelAmount = fuelTankCapacity - consumtion;

		if (Engine.isStarted == true) {
			System.out.println("Car " + name + " can't be driven cause engine stopped");

		} else if (fuelTankCapacity == 0) {
			System.out.println("You can't drive, tank is empty");
			
		} else if (Engine.isStarted == false && rFuelAmount <= 0) {
			System.out.println("Car " + name + " has been driven for " + range + "km with speed " + speed + "km/h. Fuel is empty");// I dont know how to count how many kilometers i can drive to end of fuel

		} else if (Engine.isStarted == false && speed <= Engine.maxSpeed()) {
			System.out.println("Car " + name + " has been driven for " + distance + "km with speed " + speed + "km/h. Remaining fuel: " + rFuelAmount + "l");// Why it doesn't print speed ??
			fuelTankCapacity = fuelTankCapacity - consumtion;

		} else if (Engine.isStarted == false && speed > Engine.maxSpeed()) {
			System.out.println("Car " + name + " has been driven for " + distance + "km with speed " + Engine.maxSpeed()
					+ "km/h. Remaining fuel: " + rFuelAmount + "l");
			fuelTankCapacity = fuelTankCapacity - consumtion;
		}

	}

	public String getName() {
		return name;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public String getEngine() {
		return engine;
	}
}
