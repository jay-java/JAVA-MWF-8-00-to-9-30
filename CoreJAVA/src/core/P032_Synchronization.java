package core;

class Counter {
	int count = 0;

	synchronized public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

class MyThread extends Thread {
	private Counter counter;

	MyThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class P032_Synchronization {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(counter.getCount());

	}
}
