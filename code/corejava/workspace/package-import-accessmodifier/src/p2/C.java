package p2;

import p1.A;

public class C extends A{

	public void displayByInheritance() {
		System.out.println(x);
		System.out.println(y);
		// System.out.println(z); // default/package
		// System.out.println(r); // private
	}
	
	public void displayByObject() {
		A a = new A();
		System.out.println(a.x);
		//System.out.println(a.y);
		//System.out.println(a.z);
		//System.out.println(a.r); // private and it cannot be access outside class.
	}
}
