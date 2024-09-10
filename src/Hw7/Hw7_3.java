package Hw7;

import java.io.*;

public class Hw7_3 {
	public void copyFile(String xxx, String yyy) throws IOException {
		File inputFile = new File(xxx);
		File outputFile = new File(yyy);

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}
		in.close(); 
		out.close(); 
	}
	public static void main(String[] args) throws IOException {
		Hw7_3 copy = new Hw7_3();
		copy.copyFile("C:\\CIA103_Workspace\\Homework-49\\src\\Hw7\\copy.txt", "C:\\CIA103_Workspace\\Homework-49\\src\\Hw7\\copyBryant.txt");
	}
}
