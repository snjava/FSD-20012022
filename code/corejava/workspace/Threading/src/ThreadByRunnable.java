
public class ThreadByRunnable {
	public static void main(String[] args) {
		CustomThread1 t1 = new CustomThread1();
		Thread th = new Thread(t1); // New Stage
		th.start(); // Ready Stage
	}
}

class CustomThread1 implements Runnable {
	public void run() {
		System.out.println("This is my Custom thread..");
	}
}
