import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
public static void main(String[] args) {
	int [] array = new int [10];
	for(int j=0;j<=array.length-1;j++) {
			array[j]=ThreadLocalRandom.current().nextInt(1,100);;	
		}
	System.out.printf(Arrays.toString(array));
	}
}

