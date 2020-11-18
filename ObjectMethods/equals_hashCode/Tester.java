package equals_hashCode;

public class Tester {
public static void main(String[] args) {
	Beer Heineken = new Beer("Heineken","Holland",4.5,0.5);
	Beer anotherHeineken = new Beer("Heineken","Holland",4.5,0.5);
	Beer Grolsch = new Beer("Grolsch","Holland",4.5,4.5);
	
	Beer Tyskie = new Beer("Tyskie","Poland",4.5,0.5);
	Beer ¯ywiec = new Beer("¯ywiec","POLAND",4.5,0.5);
	
	
	Beer Kozel = new CzechBeer("Kozel","Czech","Prague",5,0.5);
	Beer Kozel2 = new CzechBeer("Kozel","Czech","Prage",5,0.5);
	
	System.out.println(Heineken.equals(Grolsch));
	System.out.println(Tyskie.equals(¯ywiec));
	System.out.println(Heineken.equals(anotherHeineken));
	
	System.out.println("========= EQUALS METHOD WITHOUT PROPERTY NAME=========");
	
	System.out.println(Heineken.noNameEquals(Grolsch));
	System.out.println(Tyskie.noNameEquals(¯ywiec));
	
	System.out.println("==========COMPARING CZECH BEERS============");
	
	System.out.println(Kozel.equals(Kozel2));
	
	System.out.println("==============hashCode=============");
	System.out.println(Kozel2.hashCode());
	System.out.println(Grolsch.hashCode());
	
	
	
}
}
