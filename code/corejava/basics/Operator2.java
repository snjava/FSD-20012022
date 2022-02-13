public class Operator2
{
	public static void main(String ar[])
	{
		int a = 10;
		int b = 20;
		a = a + 5;
		b += 5;  // (b = b + 5) 
		System.out.println(a); // 15
		System.out.println(b); // 25

		byte x = 10;
		x += 10;  // x = (byte) (x + 1);
		System.out.println(x); // 11


		int m = 12;
		++m;  // m += 1;   or   m = m + 1;
		--m;  // m -= 1;   or   m = m - 1;
		System.out.println(m);	


		int n = 5;
		int z = ++n; // first increment the value of n the variable then, assigns the value to z
		System.out.println(z); // 6
		System.out.println(n); // 6



		System.out.println("=======================");
		int q = 20;
		System.out.println(++q); // 21
		System.out.println(q); // 21



		
	}
}











