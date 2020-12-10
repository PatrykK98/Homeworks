package Polymorphism_train;

import java.util.ArrayList;
import java.util.List;

import Garage.Personal;
import Garage.Trucks;

public class TransportTester {
public static void main(String[] args) {
		
	Cars small = new Cars();
	Cars seat = new Personal("Seat", 230);
	Cars audi = new Personal("Audi", 250);
	Cars vlk = new Personal("Volkswagen", 220);
	List<Cars> personalCars = new ArrayList<>();
	personalCars.add(seat);
	personalCars.add(vlk);
	personalCars.add(audi);
	for(Cars i : personalCars) {
		System.out.println(i);
	}
	
	Cars big = new Cars();
	Cars jelcz = new Trucks("Jelcz", 80);
	Cars skania = new Trucks("Skania", 90);
	Cars volvo = new Trucks("Volvo", 100);
	Cars[] list = {jelcz,skania,volvo};	
	for(Cars i: list) {
		System.out.println(i);
	}

	
	
}
}