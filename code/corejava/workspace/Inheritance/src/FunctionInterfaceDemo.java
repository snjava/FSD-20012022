
public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Animal tiger = (menu) -> {
			System.out.println("Tiger eat method");
		};
		
		tiger.eat("Non_veg");
	}
}

@FunctionalInterface
interface Animal {
	public void eat(String menu);
}
