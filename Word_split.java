
public class Word_split {
	public static void main(String[] args) {
		for (String a : args) {
			a.toCharArray();
			System.out.println(a);
		}
		System.out.println("---------------------------------------");
		String c= " ";
		String d="";
		for(int i= 0;i<=args.length-1;i++) {
		c=args.toString();
		d =d + c.charAt(i);
		System.out.println(d);// I don't know how to do it with charAt. 
		}
	}
}
