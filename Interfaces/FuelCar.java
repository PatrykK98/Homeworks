package CarWithInterfaces;

public class FuelCar extends Car implements Tankable {
	
	public FuelCar(String name, String model) {
		super(name, model);
	}
	
	@Override
	public void tank() {
		System.out.println(super.getName()+" "+super.getModel()+" has been tanked");	
	}

	
	
	
}
