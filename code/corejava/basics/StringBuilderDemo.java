public class StringBuilderDemo
{
	public static void main(String ar[])
	{
		StringBuilder sbr = new StringBuilder("Hello");

		System.out.println("Original String : " + sbr); // Hello
		sbr.append(" Java"); // Hello Java
		System.out.println("After append : " + sbr);
		sbr.insert(6, "String in "); // Hello String in Java
		System.out.println("After insert : " + sbr);
		sbr.reverse(); // avaJ ni gnirtS olleH
		System.out.println("After reverse : " + sbr);
	}
}


