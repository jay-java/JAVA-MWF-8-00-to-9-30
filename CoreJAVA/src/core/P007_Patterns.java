package core;

public class P007_Patterns {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= 4; j++) {// column
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) {// column
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= 5; i++) {// row
			for(int s =4;s>=i;s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// column
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {// row
			for(int s =4;s>=i;s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// column
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
