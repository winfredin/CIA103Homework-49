package Hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("請輸入x的值:");
			int x = sc1.nextInt();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.print("請輸入y的值:");
			int y = sc2.nextInt();
			
			Calculator cal = new Calculator(x, y);
			System.out.println(Math.pow(x, y));
			
		}catch(CalException ca){
			ca.printStackTrace();
		}catch (Exception ca) {
			System.out.println("輸入格式不正確，請輸入整數");
		}

	}
}
