package core;

import java.util.Scanner;

class ABC {
	public void call() {
		System.out.println("call method");
	}

	public void fun(int num) {
		System.out.println("num = " + num);
	}

	public int data() {
		return 1234;
	}

	public int getSquare(int num) {
		return num * num;
	}

	public void printTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}

public class P008_ClassObjectUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ABC a = new ABC();
		a.call();
		a.fun(12);
		int num = a.data();
		System.out.println(num);
		System.out.println("enter num = ");
		int n1 = sc.nextInt();
		int res = a.getSquare(n1);
		System.out.println("square of " + n1 + " is : " + res);
		a.printTable(5);

		System.out.println("enter int value = ");
		int i = sc.nextInt();
		System.out.println("enter double value = ");
		double d = sc.nextDouble();

	}
}
