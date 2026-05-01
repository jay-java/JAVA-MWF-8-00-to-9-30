package core;

class Company {
	int i;

	synchronized public void develop(int i) {
		this.i = i;
		System.out.println("Developed : " + this.i);
	}

	synchronized public int test() {
		System.out.println("Test : " + this.i);
		return this.i;
	}
}

class Developer extends Thread {
	Company c;

	Developer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			this.c.develop(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

class Tester extends Thread {
	Company c;

	Tester(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			this.c.test();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class P033_Sync {
	public static void main(String[] args) {
		Company c = new Company();

		Developer d = new Developer(c);
		Tester t = new Tester(c);
		d.start();
		t.start();
	}
}
