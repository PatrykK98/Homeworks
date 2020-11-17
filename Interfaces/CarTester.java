package CarWithInterfaces;

public class CarTester {

public static void main(String[] args) {
	Car volk = new FuelCar("Volksvagen","R32");
	Car mazd = new FuelCar("Mazda","rx-8");
	Car eVolk = new ElectricCar("Volkswagen","UP!");
	Car eMazd = new ElectricCar("Mazda","MX-30");
	Car hVolk = new HybridCar("Volkswagen","Golf");
	Car hMazd = new HybridCar("Mazda","Axel");
	
	Car [] cars = {volk, eVolk, hVolk, mazd, eMazd, hMazd};
	
	for(int i=0;i<=cars.length-1;i++) {
	if(cars[i].chargable) 
		cars[i].charge();
	
	 if(cars[i].tankable) 
		cars[i].tank();
	}
	
}
}
