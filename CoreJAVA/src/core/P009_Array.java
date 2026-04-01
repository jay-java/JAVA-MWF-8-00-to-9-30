package core;

import java.util.Scanner;

public class P009_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		for (int index = 0; index < a.length; index++) {
			System.out.println(a[index]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array = ");
		int size = sc.nextInt();
		int ar[] = new int[size];

		for (int index = 0; index < ar.length; index++) {
			System.out.print("enter element ar ar[" + index + "] : ");
			ar[index] = sc.nextInt();
		}
		for (int index = 0; index < ar.length; index++) {
			System.out.print(+ar[index]);
		}
		System.out.println();
		int sum = 0;
		for (int index = 0; index < ar.length; index++) {
			sum = sum + ar[index];
		}

		System.out.println("sum = " + sum);

		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();

		int counter = 0;
		for (int index = 0; index < ar.length; index++) {
			if (num == ar[index]) {
				counter++;
			}
		}

		if (counter > 0) {
			System.out.println("yes exist");
		} else {
			System.out.println("no exist");
		}

		int max = ar[0];
		for (int index = 1; index < ar.length; index++) {
			if (max < ar[index]) {
				max = ar[index];
			}
		}
		System.out.println("max = " + max);

	}
}
