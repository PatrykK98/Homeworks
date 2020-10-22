import java.util.Scanner;

public class Sum_Of_Numbers {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=args.length-1;i++) {
			String b = args[i];
			int a = Integer.parseInt(b);
			sum += a;
		}
		System.out.println(sum);
	}
	}
