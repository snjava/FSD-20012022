
public class FunctinalInterfaceDemo {
	public static void main(String[] args) {
		// Lambda implementation: It is a way to implement a method of the functional interface. 
		Inter1 inter = (int a) -> {
			System.out.println("This is Lambda Expression : " + (a*a));
		};
		display(inter);
		
		display((int a) -> {
			System.out.println("This is Lambda Expression : " + (a*a));
		});
	}
	
	public static void display(Inter1 inter) {
		inter.m1(5);
	}
	
}

@FunctionalInterface
interface Inter1 {
	public void m1(int a);
	public default void m2() {
	}
	public static void m3() {	
	}
}











