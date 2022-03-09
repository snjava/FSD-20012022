import java.io.Serializable;

public class Jdk8Interface {
	public static void main(String[] args) {
		Inter.test2();
		String arr[] = new String[1];
		Inter.main(arr);
		
		C1 c = new C1();
		c.test1();
	}
}

interface Inter extends Serializable{
	public default void test1() {
		System.out.println("This is default impelemented method..");
	}
	
	public static void test2() {
		System.out.println("This is static method inside interface.");
	}
	
	public static void main(String[] args) {
		System.out.println("In side main method from the interface");
	}
}
class C1 implements Inter {
	
}