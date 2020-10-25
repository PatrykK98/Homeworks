import java.util.Scanner;

public class Discount_Calculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please, provide item price: ");
	double price = input.nextDouble();
	System.out.println("Please input customer age: ");
	int age = input.nextInt();
	if(age<6) {
		double discount = 0.2*price;
		System.out.printf("Discount price is: %.2f",discount);
	}else if(age>=6 && age <=18) {
		double discount2 = 0.75*price;
		System.out.printf("Discount price is: %.2f",discount2);
	}else if(age >65) {
		double discount3 = 0.7*price;
		System.out.printf("Discount price is: %.2f",discount3); 
	}
	else {
		System.out.println("No discout, normal price is:"+price);
	}
}
}
