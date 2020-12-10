package Polymorphism_train;

public class Cars extends Transport {
	protected int maxSpeed;

	public Cars() {
	}

	public Cars(String name, int maxSpeed) {
		super(name);
		this.maxSpeed = maxSpeed;
	}

	protected void moving() {
		System.out.println("This " + super.getName() + " can go with max speed: " + maxSpeed);
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub

	}

}
