package CarWithInterfaces;

public class CarTester {

	public static void main(String[] args) {
		Car hVolk = new HybridCar("Smart", "City");
		Car hMazd = new HybridCar("Smart", "Country");
		Car volk = new FuelCar("Volksvagen", "R32");
		Car mazd = new FuelCar("Mazda", "rx-8");
		Car eVolk = new ElectricCar("Volkswagen", "UP!");
		Car eMazd = new ElectricCar("Mazda", "MX-30");

		Car[] cars = { volk, eVolk, hVolk, mazd, eMazd, hMazd };

		for (int i = 0; i <= cars.length - 1; i++) {
			if (cars[i] instanceof HybridCar) {
				((HybridCar) cars[i]).charge();
				((HybridCar) cars[i]).tank();
			}
			if (cars[i] instanceof FuelCar) {
				((FuelCar) cars[i]).tank();
			}
			if (cars[i] instanceof ElectricCar) {
				((ElectricCar) cars[i]).charge();
			}
		}
	}
}
