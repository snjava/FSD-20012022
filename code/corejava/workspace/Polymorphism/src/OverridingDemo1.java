public class OverridingDemo1 {
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m1(20);
		
		C1 c1; // reference of parent class
		c1 = new C2(); // creating object of Child class
		
		C1 c = new C2(); // Polymorphic object (Reference of parent and Object of child)
		c.m1(20);
	}
}

class C1 {
	void m1(int a) {
		System.out.println("m1 from the C1 class");
	}
}

class C2 extends C1 {
	public void m1(int a) {
		System.out.println("m1 from the c2 class");
	}
}
