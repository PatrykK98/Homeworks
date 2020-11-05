public class Avarage_Calculator {
	public static void main(String[] args) {
		double p;
		double sum = 0;
		for (String a : args) {
			p = Double.parseDouble(a);
			sum += p;
		}
		System.out.println(sum);
		double amount = args.length-1;
		double avarage = sum/amount;
		System.out.println(avarage);
	}

}
