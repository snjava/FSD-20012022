
public class LocalInnerClass {

	private int z = 20;
	
	public static void main(String[] args) {

	}

	
	public static void demo(int a, int b) {
		int x =20;
		class Local {
			public void m1() {
				
			}
		}
		int ans = a + b + x;
		System.out.println(ans);
	}
	
}
