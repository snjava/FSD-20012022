package p1;

public class B extends A{

	public void displayByObject() {
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println(a.z);
		//System.out.println(a.r); // private and it cannot be access outside class.
	}
	
	public void displayByInheritance() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//System.out.println(r); // private and it cannot be access outside class.
	}
	
}
