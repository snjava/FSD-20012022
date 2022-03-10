import java.io.Console;
import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		//Console console = System.console();
		//console.readLine();
		
		//System.in.read();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Mul : " + (num1 * num2));
		System.out.println("Div : " + (num1 / num2));
		System.out.println("Add : " + (num1 + num2));
		System.out.println("Sub : " + (num1 - num2));
		
		scan.close();
		
	}
}













