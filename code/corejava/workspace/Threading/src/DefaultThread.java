
public class DefaultThread {
	public static void main(String[] args) {
		System.out.println("Main Method Started...");
		
		Thread th = Thread.currentThread();
		System.out.println(th); // Thread[main,5,main]
		
		System.out.println("Main Method Ends...");
	}
}
