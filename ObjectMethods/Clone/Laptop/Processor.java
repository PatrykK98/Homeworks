package clone_LaptopCloning;

public class Processor {
	private String name;
	private int coresNumber;
	private double frequency;

	public Processor(String name , int coresNumber, double frequency ) {
		this.name = name;
		this.coresNumber = coresNumber;
		this.frequency = frequency;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCoresNumber(int coresNumber) {
		this.coresNumber = coresNumber;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public int getCoresNumber() {
		return coresNumber;
	}

	public double getFrequency() {
		return frequency;
	}
	
	

}
