package core;

public class P006_Loops {
	public static void main(String[] args) {
		// (< , ++) (> , --)
		// 1.for loop(init;condi;incre/decre){body} - entry control
		System.out.println("for loop incre");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("for loop decre");
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

		// 2.while(condition){body} - entry control
		System.out.println("while incre");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}

		System.out.println("while decre");

		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l--;
		}

		// 3.do while - exit
		System.out.println("do while incre");
		int a = 11;
		do {
			System.out.println(a);
			a++;
		} while (a <= 10);

		System.out.println("do while decre");
		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while (b >= 1);
		
		// 4.for each
	}
}
