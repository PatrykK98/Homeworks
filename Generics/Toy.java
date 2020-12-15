
public class Toy extends Item {
	private String name;
	public Toy(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
