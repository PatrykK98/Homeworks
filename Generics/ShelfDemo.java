import java.util.ArrayList;

public class ShelfDemo {
	public static void main(String[] args) {

		Fantasy fBook1 = new Fantasy("Clean Code","Robert C.Martin");
		Fantasy fBook2 = new Fantasy("Harry Poter", "Rowling");
		Book book1 = new Book("Shining", "Stephen King");
		Book book2 = new Book("Superman", "Antonio Banderas");
		Toy toy1 = new Toy("Hootwheels");
		Toy toy2 = new Toy("Remoted car");
		Food food1 = new Food("zapiekanka");
		Food food2 = new Food("frytki"); 
		
		Box<Toy> toyBox = new Box<>();
		toyBox.add(toy1);
		toyBox.add(toy2);
		
		Box<Book> booksBox = new Box<>();
		booksBox.add(fBook1);
		booksBox.add(fBook2);
		booksBox.add(book1);
		booksBox.add(book2);
		
		Box<Fantasy> fBookBox = new Box<>();
		fBookBox.add(fBook1);
		fBookBox.add(fBook2);
	
		Box<Food> fBox = new Box<>();
		fBox.add(food1);
		fBox.add(food2);
		
		Shelf<Book>bookShelf = new Shelf<>();
		bookShelf.add(booksBox);
		bookShelf.add(fBookBox);
		
		Shelf<Toy> toyShelf = new Shelf<>();
		toyShelf.add(toyBox);
		
		Shelf<Item> stuffShelf = new Shelf<>();
		stuffShelf.add(toyBox);
		stuffShelf.add(fBookBox);
		stuffShelf.add(fBox);
		stuffShelf.add(booksBox);
		
		fBookBox.getItems();
	}
}
