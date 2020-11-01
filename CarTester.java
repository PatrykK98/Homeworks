
public class CarTester {
	public static void main(String[] args) {
		Engine diesel = new Engine("Diesel", 130, 2000);
		Car vw = new Car("VW Golf", "diesel", 50);
		
		vw.startEngine();
		
		vw.drive(100, 50);
		vw.drive(100, 50);
		vw.drive(100, 200);
		
			}
}
