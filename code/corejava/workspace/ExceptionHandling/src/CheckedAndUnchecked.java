import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUnchecked {

	public static void main(String[] args) {
		
		
		try {
			FileReader read = new FileReader("E:\\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			int arr[] = {23,45,56};
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("Array Exception Handled");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();
		}
	}

}













