
public class StaticKeyword1 {
	public static void main(String[] args) {
		Test.InnerClass.print();
		System.out.println(Test.a);
	}
}

class Test {
	
	static final int maxRecord = 10;
	
	static int a; // static variable
	
	static { // static block
		a = 10;
		System.out.println("This is Static block....");
	}
	
	static class InnerClass {  // Static class
		public static void print() {
			System.out.println("This is Print from inner class..");
		}
	}
}
