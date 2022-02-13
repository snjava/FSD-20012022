public class VariableDemo4
{
	public static void main(String ar[])
	{
		int x = 10;
		long y = x;  // implicit casting
		System.out.println(y);

		short z = (short) x; // explicit casting
		System.out.println(z);

		int a = 127;
		byte b = (byte) (a+10);
		System.out.println(b);

	}
}