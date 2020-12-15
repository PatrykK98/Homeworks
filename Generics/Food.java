
public class Food extends Item {
private String name;
public Food(String name) {
	this.name=name;
}
@Override
public String toString() {
	return name;
}

}
