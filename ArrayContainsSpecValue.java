class Test1 {
	public static boolean spec(int[] array, int value) {
		for (int i : array) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void specv(int[] array, int value) {// Where is mistake in this method ????
		int i;
		for (i = 0; i <= array.length-1; i++) {
			if (array[i] == value) {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
				break;
			}
		}
	}
}

public class ArrayContainsSpecValue {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		System.out.println("return method:");
		System.out.println(Test1.spec(array, 2));

		System.out.println("\nvoid method:");
		Test1.specv(array, 20);
	}
}
