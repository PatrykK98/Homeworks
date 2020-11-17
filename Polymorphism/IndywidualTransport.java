package Transport;

public class IndywidualTransport extends Transport {
	private String owner;
	
	
	public IndywidualTransport(String type, int qty, String owner) {
		super(type, qty);
		this.owner=owner;
	}

	public void maintain() {
		System.out.println(getOwner()+" maintains "+super.getQty()+" "+super.getType());
	}

	public String getOwner() {
		return owner;
	}
	
}
