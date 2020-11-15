package CarWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargable {
	
	public HybridCar(String name, String model) {
		super(name, model);	
	}

	@Override
	public void charge() {
	System.out.println(super.getName()+" "+super.getModel()+" has been charged");
	}

	@Override
	public void tank() {
		System.out.println(super.getName()+" "+super.getModel()+" has been tanked");	
		
	}


	
	

}
