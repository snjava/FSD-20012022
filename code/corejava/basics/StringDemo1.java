public class StringDemo1
{
	public static void main(String ar[])
	{
		String msg1 = new String("Hello");
		String msg2 = new String("Hello");
		String msg3 = "Hello";
		String msg4 = "Hello";

		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);

		System.out.println(msg1 == msg2); // false
		System.out.println(msg2 == msg3); // false
		System.out.println(msg3 == msg4); // true

		System.out.println(msg1 == "Hello"); // false
		System.out.println(msg3 == "HELLO"); // false
		System.out.println(msg3 == "Hello"); // true
	}
}