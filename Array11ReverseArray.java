import java.util.Arrays;

class App {
	public static void reverse(int []array) {
		int [] newArray = new int [array.length-1];// I want to make "newArray" to be same as "array" but in reverse order, is it possible to do it that way ???
		for(int i=array.length-1;i>=0;i--) {		
			for(int j=0;j<=array.length-1;j++) {
				newArray[j]=array[i];
				System.out.println(newArray[j]);
			}
		}				
	}
}

public class Array11ReverseArray {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		App.reverse(array);
	}
}
