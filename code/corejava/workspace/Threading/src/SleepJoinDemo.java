
public class SleepJoinDemo {
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1(); // New Stage
		t1.start(); // Runnable Stage
		
		System.out.println("====Main Startes====");
		
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int j = 100; j <= 110; j++) {
			System.out.println(" j : " + j);
		}
		
		//t1.resume();
	}
}

class ThreadDemo1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(" i : " + i);
			// stop();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//suspend();
		System.out.println("=====Thread Ends=====");
	}
}
