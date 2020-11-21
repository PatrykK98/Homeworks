package clone_LaptopCloning;

public class Tester {
public static void main(String[] args) {
	
	Processor intel = new Processor("Intel", 7 , 2.5 );
	HardDrive huge = new HardDrive("Sata", 5463, "SSD");
	Laptop lap1 = new Laptop( intel, "Laptop HP", huge );

	System.out.println("============CLONE==========");
	Laptop lap1Clone = Laptop.copy(lap1);
	System.out.println(lap1Clone.getName()+" with processor "+lap1Clone.getProcessor().getName()+" with "+lap1Clone.getProcessor().getCoresNumber()+" cores and processor frequency: "+lap1Clone.getProcessor().getFrequency()+" GHZ . Harddrive brand is: "+lap1Clone.getHarddrive().getName()+" with capacity: "+lap1Clone.getHarddrive().getCapacity()+" gb and type is "+lap1Clone.getHarddrive().getType());
	
	System.out.println("============COPY==========");
	
	System.out.println(lap1.getName()+" with processor "+lap1.getProcessor().getName()+" with "+lap1.getProcessor().getCoresNumber()+" cores and processor frequency: "+lap1.getProcessor().getFrequency()+" GHZ . Harddrive brand is: "+lap1.getHarddrive().getName()+" with capacity: "+lap1.getHarddrive().getCapacity()+" gb and type is "+lap1.getHarddrive().getType());
	
	lap1.getProcessor().setName("Santamonica");
	System.out.println(lap1Clone.getProcessor().getName());
	System.out.println(lap1.getProcessor().getName());
}
}
