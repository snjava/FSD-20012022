
public class OverloadingDemo1 {
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(23.3, 123.4);
		addition.add("Abcd", "Xyz");
		addition.add(23, 123, 23);
	}
	//========Overloading main method=======
	public static void main(int[] a) { 
		
	}

	public static void main(int a) {
		
	}
	
	public static void main(String a) {
		
	}
}
class Addition {
	static {
		System.out.println("This is static block");
	}
	public final static int add(int a, int b) {  // 1
		int ans = a + b;
		System.out.println("2 int addition : " + ans);
		return ans;
	}
	protected static int add(int a, int b, int c) { // 2
		int ans = a + b + c;
		System.out.println("3 int addition : " + ans);
		return ans;
	}
	static double add(double a, double b) { // 3
		double ans = a + b;
		System.out.println("2 double addition : " + ans);
		return ans;
	}
	public static String add(String a, String b) { // 4
		String ans = a.concat(b); // a + b
		System.out.println("2 String addition : " + ans);
		return ans;
	}
}
