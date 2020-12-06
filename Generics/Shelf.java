
public class Shelf<T> extends Box<T>{
	private Box<?> box;
	
	public void add(Box<? extends T>box) {
		this.box=box;
	}
	
}
