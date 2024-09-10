package Hw7;

import java.io.*;

public class Hw7_2 {
	public static void main(String[] args) {
		try {

			FileOutputStream fos = new FileOutputStream("c:\\javawork\\Data.txt", true);

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);
			
			int[] raa = new int[10];
			for(int i = 0; i < raa.length; i++) {
				raa[i] = (int)(Math.random() * 1000+ 1 );
				ps.println(raa[i]);
			}	
			

			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
