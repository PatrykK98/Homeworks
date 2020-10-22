
public class FindMinElement {
	public static void main(String[] args) {
		int[] intarray = new int[args.length];
		int i = 0;
		for (String str : args) {
			intarray[i] = Integer.parseInt(str);// Exception in this line
			i++;	
		}
		int min = intarray[0];
		for(int j =0;j<=intarray.length-1;j++) {
			if(intarray[j] < min) {
				min = intarray[j];	
			}
		}
		System.out.println(min);
	}

}
