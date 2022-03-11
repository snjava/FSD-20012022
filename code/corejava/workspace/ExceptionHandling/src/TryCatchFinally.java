import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int numbers[] = {23,45,6,23,8,5,0,12,0};
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st Index : ");
			int index1 = scan.nextInt();
			System.out.println("Enter 2nd Index : ");
			int index2 = scan.nextInt();
			
			int div = numbers[index1]/numbers[index2];
			System.out.println(numbers[index1] + "/" + numbers[index2] + " = " + div);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input.. Please enter valid numeric value..");
		}
		catch(ArithmeticException ex) {
			System.out.println("You cannot divide by 0..");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("The provided index is not avaiable..");
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong. Please try after some time");
		}
		finally {
			scan.close();
		}
		
		
		System.out.println("Main Ends");
		
	}
}
