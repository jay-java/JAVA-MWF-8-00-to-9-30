package core;

import java.util.InputMismatchException;
import java.util.Scanner;

class Dataa { // A
	public void divide() throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
	}

//	public void divide() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a = ");
//		int a = sc.nextInt();
//		System.out.println("enter b = ");
//		int b = sc.nextInt();
//		if (a > 0 && b > 0) {
//			int c = a / b;
//			System.out.println("c = " + c);
//		} else {
//			throw new ArithmeticException("number should be greater than 0");
//		}
//	}
}

public class P018_Exception { // B
	public static void main(String[] args) {
		Dataa d = new Dataa();
//		d.divide();
		try {
			d.divide();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (InputMismatchException e) {

		}

		// 1.try 2.catch 3.finally 4.throw 5.throws

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println("c = " + c);
//		} catch (ArithmeticException e) {
//			System.out.println("number should be greater than 0");
//		} catch (InputMismatchException e) {
//			System.out.println("value should be type of numeric");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("this code will executes everytime");
//		}
	}
}
