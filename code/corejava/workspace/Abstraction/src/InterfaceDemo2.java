
public class InterfaceDemo2 {
	public static void main(String[] args) {
		
	}
}

interface I1 {
	public void m1();
}

interface I2 {
	public void m2();
}

// one interface can extends more than one interface
interface I3 extends I1, I2 {
	public void m3();
}

// one class can implements more than one interface.
abstract class Demo implements I1,I2 {
	
}

// one class extends another class and implements interface.
class Demo1 extends Demo implements I3 {
	@Override
	public void m1() {
	}
	@Override
	public void m2() {
	}
	@Override
	public void m3() {
	}
}






