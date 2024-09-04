package Hw5;

import java.util.Scanner;

public class Hw5_1 {
//	1 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形

	static void starSquare(int width, int height) {
		for (int i1 = 0; i1 < height; i1++) {
			for (int i2 = 0; i2 < width; i2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("輸入高度:");
		int height = sc1.nextInt();
		System.out.print("輸入寬度:");
		int width = sc1.nextInt();

		starSquare(width, height);
	}
}






