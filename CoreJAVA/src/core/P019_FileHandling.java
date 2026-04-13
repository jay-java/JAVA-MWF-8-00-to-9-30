package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class P019_FileHandling {
	public static void main(String[] args) throws IOException {
		// FileOutputStream - to write data into file
		// WORA
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		String s = "this msg will written into file";
//		byte b[] = s.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		

		// FileInputStream - to read data from file
//		FileInputStream fis = new FileInputStream("t1.txt");
//		int i;
//		while ((i = fis.read()) != -1) {
//			System.out.print((char) i);
//		}

		// FileWriter - to write
//		String s = "this msg will written into file";
//		FileWriter fr = new FileWriter("t2.txt");
//		fr.write(s);
//		fr.flush();
//		fr.close();
//		System.out.println("data written successfully");

		// FileReader - to read
		FileReader fr = new FileReader("t2.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
