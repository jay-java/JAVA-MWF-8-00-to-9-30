package core;

class ByThreadClass extends Thread {
	@Override
	public void run() {
		System.out.println("thread runnign by thread class");
	}

}

class ByRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("thread runnign by runnable interface");
	}

}

class MultipleThread implements Runnable {
	private String threadName;

	MultipleThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + " -> count : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class P031_THread {
	public static void main(String[] args) {

		Thread t1 = new Thread(new MultipleThread("thread 1"));
		Thread t2 = new Thread(new MultipleThread("thread 2"));
		t1.start();
		t2.start();

//		ByThreadClass t1 = new ByThreadClass();
//		t1.start();
//		Thread t2 = new Thread(new ByRunnableInterface());
//		t2.start();

		/*
		 * System.out.println(Thread.currentThread()); Thread t = new Thread();
		 * t.setName("MyThread"); System.out.println(t); long startTime =
		 * System.currentTimeMillis(); for (int i = 1; i <= 5; i++) {
		 * System.out.println(t + " : " + i); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } } long endTime =
		 * System.currentTimeMillis(); System.out.println("total time : " + (endTime -
		 * startTime));
		 */
	}
}
