
public class Word_split {
	public static void main(String[] args) {
		System.out.println("toCharArray() METHOD: \n");
		char[] letters = args[0].toCharArray();
		for (char i : letters) {
			System.out.println(i);
		}

		System.out.println("\ncharAt(index) METHOD: \n");
		String word = args[0].toString();
		for (int j = 0; j <= word.length() - 1; j++) {
			System.out.println(word.charAt(j));
		}
	}
}
