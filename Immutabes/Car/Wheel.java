package Car;

public class Wheel {
	int radius;
	int width;
	
	public Wheel(int radius, int width) {
		this.radius = radius;
		this.width = width;
	}
	
	public int getRadius() {
		return radius;
	}
	public int getWidth() {
		return width;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Set of wheels with dimensions:[ width: "+width+" radius: "+radius;
	}
	
	
}
