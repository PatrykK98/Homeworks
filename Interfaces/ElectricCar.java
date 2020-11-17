package CarWithInterfaces;

public class ElectricCar extends Car implements Chargable {

	public ElectricCar(String name, String model) {
		super(name, model);
		}

	@Override
	public void charge() {
		System.out.println(super.getName()+" "+super.getModel()+" has been charged\n");
	}

	
}
