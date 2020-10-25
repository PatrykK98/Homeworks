
public class PrimeNumber {
	public static void main(String[] args) {
		int x = 2;
		while (x <= 100) {
			int y = 2;
			while (y <= x) {
				if (x == y) {
					System.out.println(x);
				}
				if (x % y == 0) {
					break;
				}
				y++;
			}
			x++;
		}
	}
}