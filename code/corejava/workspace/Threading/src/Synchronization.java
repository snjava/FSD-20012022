public class Synchronization {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread1 t1 = new Thread1(printer);
		Thread2 t2 = new Thread2(printer);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	private Printer p;
	public Thread1(Printer printer) {
		this.p = printer;
	}
	public void run() {
		synchronized (p) 
		{
			for(int i = 1; i <= 10 ; i++) {
				p.print("5 * " + i + " = " +( 5 * i) +"\n");
				
				if(i == 5) {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}
	}
}


class Thread2 extends Thread {
	private Printer p;
	public Thread2(Printer printer) {
		this.p = printer;
	}
	public void run() {
		synchronized (p) 
		{
			for(int i = 1; i <= 10 ; i++) {
				p.print("15 * " + i + " = " +( 15 * i) +"\n");
			}
			p.notify();
		}
	}
}


class Printer {
	//public synchronized void print(String val) {
	public void print(String val) {
		System.out.print(val);
	}
}

