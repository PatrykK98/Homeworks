package Transport;

public class Transport {
	private String type;
	private int qty;
	
	public Transport(String type, int qty) {
		super();
		this.type = type;
		this.qty = qty;
	}
	public Transport(String type) {
		super();
		this.type = type;
	}
	
	public void move() {
	}
	
	public void maintain() {
	}
	
	public void rides() {
	}

	public String getType() {
		return type;
	}

	public int getQty() {
		return qty;
	}
	
}
