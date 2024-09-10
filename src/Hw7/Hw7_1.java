package Hw7;

import java.io.*;

public class Hw7_1 {

	public static void main(String[] args) {
		try {
			File f1 = new File("c:\\javawork\\Sample.txt");
			FileReader file = new FileReader("c:\\javawork\\Sample.txt");
			BufferedReader reader = new BufferedReader(file);

			long fileBytes = f1.length();
			long charCount = 0;
			long lineCount = 0;
			String line;

			while ((line = reader.readLine()) != null) {
				charCount += line.length(); // 加總每行的字元數
				lineCount++;
			}
			reader.close();
			file.close();
			System.out.println("Sample.txt 檔案共有 " + fileBytes + " 個位元組，" + charCount + " 個字元，" + lineCount + " 列資料");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
