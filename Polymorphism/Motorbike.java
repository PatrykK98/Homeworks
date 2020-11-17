package Transport;

public class Motorbike extends Transport {
	private String driver;
	private String brand;
	
	public Motorbike(String type, String driver, String brand) {
		super(type);
		this.driver=driver;
		this.brand=brand;
	}

	public void rides() {
		System.out.println(super.getType()+" "+getBrand()+" is ride by "+getDriver());
	}
	
	public String getDriver() {
		return driver;
	}

	public String getBrand() {
		return brand;
	}
	
}
