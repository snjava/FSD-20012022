public class Calculation
{
	public static void main(String args[])
	{
		System.out.println("main Method Starts...");
		add();

		Calculation cal; // reference Variable.
		cal = new Calculation(); // Object of class.

		// Calculation cal = new Calculation();

		int a = cal.sub();

		cal.mul(12, 2);

		double division = cal.div(12.2, 2.2);

		System.out.println("Division : " + division);

		System.out.println("main Method Ends...");
	}

	// add (Create a method "add" which will not accept any input parameter and not return any thing)
	public static void add()
	{
		int a = 20;
		int b = 30;
		int ans = a + b;
		System.out.println("Add : " + ans);
	}

	// sub (Create a method "sub" which will not accept any input param but it will return the sub of the number)
	protected int sub()
	{
		int a = 20;
		int b = 5;
		int ans = a - b;
		System.out.println("Sub : " + ans);
		return ans;
	} 

	// mul (create a method "mul" which will not return any thing but accepts 2 int numbers to perform multiplication)
	void mul(int a, int b)
	{
		int ans = a * b;
		System.out.println("Mul : " + ans);
	}
	
	// div (create a method "div" which accets 2 double numbers and return the division of those number)
	public double div(double x, double y)
	{
		return x / y;
	}
}











