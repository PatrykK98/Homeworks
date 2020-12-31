
package Car;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
public static void main(String[] args) {
	Wheel alu = new Wheel(125, 250);
	List<Wheel> aluWheels = List.of(alu);
	//aluWheels.add(steel); THROWS AN EXCEPTION
	Engine TDI = new Engine("diesel", 170, 2.0);
	Car seat = new Car("seat", "leon", TDI, aluWheels);
	System.out.println(seat.toString());
	seat.getEngine().setHorsePower(0);	// DOES NOTHING
	seat.getEngine().setType("petrol"); // DOES NOTHING
	System.out.println(seat.toString());
	
}
}
