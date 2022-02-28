
public class FinalKeyword {
	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
		demo.getWeight();
	}
}


final class FinalDemo { // final class.
	public final double GRAVITY = 9.8; // final Variable
	
	public final void getWeight() { // final method
		final int a = 20;
		//gravity = gravity + 10;
		System.out.println(GRAVITY);
	}
}
