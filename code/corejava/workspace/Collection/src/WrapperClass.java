
public class WrapperClass {
	public static void main(String[] args) {
		int a = 20;
		Integer b = new Integer(20);
		Integer c = a;   // Auto-Boxing (Primitive values can be convert into Wrapper class Object)
		int d = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
