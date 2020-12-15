
public class Book extends Item {
	private String author;
	private String title;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		return title+" written by "+author;
	}
}

