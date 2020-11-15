package CarWithInterfaces;

public class CarTester {

public static void main(String[] args) {
	FuelCar volk = new FuelCar("Volksvagen","R32");
	FuelCar mazd = new FuelCar("Mazda","rx-8");
	ElectricCar eVolk = new ElectricCar("Volkswagen","UP!");
	ElectricCar eMazd = new ElectricCar("Mazda","MX-30");
	HybridCar hVolk = new HybridCar("Volkswagen","Golf");
	HybridCar hMazd = new HybridCar("Mazda","Axel");
	
	Car [] cars = {volk, eVolk, hVolk, mazd, eMazd, hMazd};
	for(int i=0;i<=cars.length-1;i++) {
		
		if((Tankable)cars[i] != null) {
			((Tankable)cars[i]).tank();
		}
		else if((Chargable)cars[i] != null) { 
			((Chargable)cars[i]).charge();
		}
		
	}
}
}
