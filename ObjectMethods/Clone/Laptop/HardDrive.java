package clone_LaptopCloning;

public class HardDrive  {
	private String name;
	private String type;
	private int capacity;
	
	public HardDrive(String name, int capacity,String type) {
		this.capacity=capacity;
		this.type=type;
		this.name=name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}
