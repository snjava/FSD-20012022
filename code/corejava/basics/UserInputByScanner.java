import java.util.Scanner;
public class UserInputByScanner
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Name : ");
		String name = scan.next();

		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();

		System.out.println("Name : " + name);
		System.out.println(num1 + num2);
	
		scan.close();

	}
}

