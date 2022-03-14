import java.util.InputMismatchException;
import java.util.Scanner;

public class Jdk7Enhancement {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in);)  // try with resource
		{
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			
			try { // nested try catch
				System.out.println("Div : " + (num1/num2));
			} catch(ArithmeticException e) {
				System.out.println("Cannot Divide by 0");
			}
			
			System.out.println("Mul : " + (num1*num2));
			System.out.println("Add : " + (num1+num2));
			System.out.println("Sub : " + (num1-num2));
		}
		catch (InputMismatchException | ArrayIndexOutOfBoundsException e) { // catch with multiple Exception type
			System.out.println("Somtime went wrong, try after some time..");
		}
	}

}
