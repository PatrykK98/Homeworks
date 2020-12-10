package Garage;

import Polymorphism_train.Cars;

public class Personal extends Cars {

	public Personal(String name,int maxSpeed) {
		super(name, maxSpeed);
	}

	@Override
	public String toString() {
		return "Personal [maxSpeed=" + maxSpeed + ", name=" + getName() + "]";
	}
	
	

}
