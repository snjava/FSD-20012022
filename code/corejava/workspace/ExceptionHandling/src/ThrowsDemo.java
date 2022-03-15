import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException, NullPointerException, ArithmeticException {
		readData("E:\\test.txt");
	}

	public static void readData(String file) throws FileNotFoundException {
		FileReader read = new FileReader(file);
	}
	
	
	
	public void m(int a) throws FileNotFoundException {
	}
	
	public void m(String s) throws IOException {
	}
	
}

class Test extends ThrowsDemo {
	public void m(String s) throws FileNotFoundException {
		
	}
}

















