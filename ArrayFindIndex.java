class Try{
	public static int index (int [] array , int value) {
		if(array == null)return -1;// It means: when array is empty ?
		int i=0;
		while (i<=array.length-1) {
			if(array[i] == value) {
				return i;
		}else { 
				i=i+1;
		}	
		}return i;
	}
}
public class ArrayFindIndex {
public static void main(String[] args) {
	int [] array = {1,2,3,4,5};
	System.out.println(Try.index(array, 0));
}
}
