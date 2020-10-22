public class Avarage_Calculator {
	public static void main(String[] args) {
		int p;
		int sum = 0;
		for (String a : args) {
			p = Integer.parseInt(a);
			sum += p;
		}
		System.out.println(sum);
		int amount;
		for (amount = 0; amount <= args.length - 1; amount++) {
		}
		double avarage = sum/amount;
		System.out.println(avarage);
	}

}
