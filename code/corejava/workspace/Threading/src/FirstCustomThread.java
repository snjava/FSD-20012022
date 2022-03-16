
public class FirstCustomThread {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Started...");
		//ThreadGroup tg = new ThreadGroup("Demo");
		//CustomThread customThread = new CustomThread(tg, "My1stThread");
		CustomThread customThread = new CustomThread();
		customThread.setName("My1stThread");
		customThread.setPriority(10); // must be between 1-10

		customThread.start(); // ready to execute
		
		System.out.println(Thread.currentThread());
		
		System.out.println("Main Thread Ends...");
	}
}

class CustomThread extends Thread {
	//public CustomThread(ThreadGroup tg, String name) {
	//	super(tg, name);
	//}
	public void run() {
		System.out.println("Custom Thread started..");
		
		System.out.println(Thread.currentThread());
		
		System.out.println("Custom Thread Ends..");
	}
}
