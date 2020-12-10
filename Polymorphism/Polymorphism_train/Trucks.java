package Garage;

import Polymorphism_train.Cars;

public class Trucks extends Cars {
	
	public Trucks(String name, int maxSpeed) {
		super(name,maxSpeed);
	}

	@Override
	public String toString() {
		return "Trucks [maxSpeed=" + maxSpeed + ", name=" + getName() + "]";
	}




}
