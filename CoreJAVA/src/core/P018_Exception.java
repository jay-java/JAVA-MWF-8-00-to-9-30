package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P018_Exception {
	public static void main(String[] args) {
		// 1.try 2.catch 3.finally 4.throw 5.throws

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			int a = sc.nextInt();
			System.out.println("enter b = ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("c = " + c);
		} catch (ArithmeticException e) {
			System.out.println("number should be greater than 0");
		} catch (InputMismatchException e) {
			System.out.println("value should be type of numeric");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("this code will executes everytime");
		}
	}
}
