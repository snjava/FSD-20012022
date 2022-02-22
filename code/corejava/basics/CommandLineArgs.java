public class CommandLineArgs
{
	public static void main(String args[])
	{
		System.out.println("Name : " + args[0]);
		System.out.println("City : " + args[1]);
		System.out.println("Num1 : " + args[2]);
		System.out.println("Num2 : " + args[3]);
		int n1 = Integer.parseInt(args[2]);
		int n2 = Integer.parseInt(args[3]);
		System.out.println(n1 + n2);
		
	}
}