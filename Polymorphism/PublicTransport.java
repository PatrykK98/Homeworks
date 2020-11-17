package Transport;

public class PublicTransport extends Transport {
	private String origin;
	
	public PublicTransport(String type, int qty, String origin) {
		super(type, qty);
		this.origin=origin;
	}

	public void move() {
		System.out.println("There are "+super.getQty()+" "+super.getType()+" made by "+ getOrigin() );
	}
	
	public String getOrigin() {
		return origin;
	}
	
}
