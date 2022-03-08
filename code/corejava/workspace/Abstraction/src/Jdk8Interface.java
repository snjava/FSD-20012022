
public class Jdk8Interface {
	public static void main(String[] args) {
	
	}
}

interface Inter {
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
