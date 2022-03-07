
public class OverrideObjectClassFunction extends Object {

	@Override
	public String toString() {
		return "This is an Object...";
	}
	
	@Override
	public int hashCode() {
		return 1;
	}

	public static void main(String[] args) {
		OverrideObjectClassFunction obj = new OverrideObjectClassFunction();
		System.out.println(obj.toString());
	}
}
