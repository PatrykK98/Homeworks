package BoxesAndShelves;

public class Tester {
    public static void main(String[] args) {

        Food chicken = new Food();
        Toy car = new Toy();
        Toy doll = new Toy();
        Book criminal = new Book();
        Fantasy fantasy = new Fantasy();

        Box<Food> foodBox = new Box();
        Box<Toy> toyBox = new Box();
        Box<Book> bookBox = new Box();
        Box<Fantasy> fantasyBox = new Box();

        foodBox.add(chicken);
        toyBox.add(car);
        toyBox.add(doll);
        bookBox.add(criminal);
        fantasyBox.add(fantasy);

        Shelf<Toy> toyShelf = new Shelf();
        toyShelf.add(toyBox);


        Shelf<Book> bookShelf = new Shelf();
        bookShelf.add(bookBox);
        bookShelf.add(fantasyBox);

        Shelf<Item> stuffShelf = new Shelf();
        stuffShelf.add(toyBox);
        stuffShelf.add(bookBox);
        stuffShelf.add(fantasyBox);
        stuffShelf.add(foodBox);

        System.out.println(toyBox.getItem());
        System.out.println(stuffShelf.getBoxes());
    }
}
