package HW3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
//1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		if(i == j && j == k && (i != 0  || j != 0 || k != 0)) {
			System.out.println("正三角形");
		}else if(i != 0  && j != 0 && k != 0 && (i == j || j == k || k == i) && (i + j > k && j + k > i && k + i > j)){
			System.out.println("等腰三角形");
		}else if((i != 0  || j != 0 || k != 0) && (((int)Math.pow(i,2) + (int)Math.pow(j,2) == (int)Math.pow(k,2)) || ((int)Math.pow(j,2) + (int)Math.pow(k,2) == (int)Math.pow(i,2)) || ((int)Math.pow(k,2) + (int)Math.pow(i,2) == (int)Math.pow(j,2)))) {
			System.out.println("直角三角形");
		}else if(i + j > k && j + k > i && k + i > j) {
			System.out.println("其他三角形");
		}else {
			System.out.println("不是三角形");
		}

//        Scanner sc = new Scanner(System.in);
//        System.out.println("請輸入三個數字：");
//        int i = sc.nextInt();
//        int j = sc.nextInt();
//        int k = sc.nextInt();
//
//        if (isValidTriangle(i, j, k)) {
//            if (i == j && j == k) {
//                System.out.println("正三角形");
//            } else if (i == j || j == k || k == i) {
//                System.out.println("等腰三角形");
//            } else if (isRightTriangle(i, j, k)) {
//                System.out.println("直角三角形");
//            } else {
//                System.out.println("其他三角形");
//            }
//        } else {
//            System.out.println("不是三角形");
//        }
//    }
//
//    private static boolean isValidTriangle(int a, int b, int c) {
//        return a + b > c && b + c > a && c + a > b;
//    }
//
//    private static boolean isRightTriangle(int a, int b, int c) {
//        return (a * a + b * b == c * c) || 
//               (b * b + c * c == a * a) || 
//               (c * c + a * a == b * b);
//    }

//2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
		
		
		
		
//3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數
		
		
		
	}	
}