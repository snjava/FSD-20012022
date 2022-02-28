
public class SuperKeyword {
	public static void main(String[] args) {
		//B b = new B();
		//b.m1();
		
		C2 c = new C2(10);
	}
}


class C1 {
	public C1() {
		super(); // calls a super class constructor using super keyword.
		System.out.println("No param - C1 Class");
	}
	public C1(int a) {
		System.out.println("1 int Param - C1 class");
	}
}

class C2 extends C1 {
	public C2() {
		super(10);
		System.out.println("No Param - C2 Class");
	}
	public C2(int a) {
		this();
		System.out.println("1 int Param - C2 class");
	}
}

class C3 extends C2 {
	public C3() {
		System.out.println("No Param - C3 Class");
	}
}


class Z {
	int x = 40;
}

class A extends Z {
	int x = 10;
	public void test() {
		System.out.println("Class A - test()");
	}
}

class B extends A {
	int x = 20;
	public void test() {
		System.out.println("Class B - test()");
	}
	public void m1() {
		int x = 30;
		System.out.println(x); // 30
		System.out.println(this.x); // 20
		System.out.println(super.x); // 10 // calling super class variable
		super.test(); // calling super class method
	}
}
