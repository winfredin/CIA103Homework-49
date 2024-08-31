package HW3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
//1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：	
//		(進階功能：加入直角三角形的判斷)
//		Scanner s = new Scanner(System.in);
//		System.out.println("請輸入");
//		int i = s.nextInt();
//		int j = s.nextInt();
//		int k = s.nextInt();
//		
//		if(i == j && j == k && (i != 0  || j != 0 || k != 0)) {
//			System.out.println("正三角形");
//		}else if(i != 0  && j != 0 && k != 0 && (i == j || j == k || k == i) && (i + j > k && j + k > i && k + i > j)){
//			System.out.println("等腰三角形");
//		}else if((i != 0  || j != 0 || k != 0) && (((int)Math.pow(i,2) + (int)Math.pow(j,2) == (int)Math.pow(k,2)) || ((int)Math.pow(j,2) + (int)Math.pow(k,2) == (int)Math.pow(i,2)) || ((int)Math.pow(k,2) + (int)Math.pow(i,2) == (int)Math.pow(j,2)))) {
//			System.out.println("直角三角形");
//		}else if(i + j > k && j + k > i && k + i > j) {
//			System.out.println("其他三角形");
//		}else {
//			System.out.println("不是三角形");
//		}
//			使用方法

//        Scanner sc = new Scanner(System.in);
//        System.out.println("請輸入三個數字：");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = sc.nextInt();
//
//        if (isValidTriangle(x, y, z)) {
//            if (x == y && y == z) {
//                System.out.println("正三角形");
//            } else if (x == y || y == z || z == x) {
//                System.out.println("等腰三角形");
//            } else if (isRightTriangle(x, y, z)) {
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
//		int ra = (int)(Math.random()*9 + 1);
//		
//		Scanner scc = new Scanner(System.in);
//		System.out.println("開始猜數字吧!");
//		
//		int c1 = 0;
//		while(c1 <= 10) {
//			c1++;
//			int goodNum = scc.nextInt();
//			if(ra == goodNum) {
//				System.out.printf("答對了!答案是%d 這是第%d次嘗試 %n ", ra, c1);
//				break;
//			}else{
//				System.out.printf("猜錯囉 這是第%d次嘗試 %n",c1);
//				System.out.println("請再輸入一次");						
//			}
//		}

//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

//		int raa = (int)(Math.random()*100 + 1);
//		
//		Scanner scc1 = new Scanner(System.in);
//		System.out.println("開始猜數字吧!");
//		
//		int c2 = 0;
//		while(c2 <= 10) {
//			c2++;
//			int niceNum = scc1.nextInt();
//			if(niceNum > raa) {
//				System.out.printf("猜錯囉 太大了 這是第%d次嘗試 %n",c2);
//				System.out.println("請再輸入一次");
//			}else if(niceNum < raa){
//				System.out.printf("猜錯囉 太小了 這是第%d次嘗試 %n",c2);
//				System.out.println("請再輸入一次");						
//			}else {
//				System.out.printf("答對了!答案是%d 這是第%d次嘗試 %n ", raa, c2);
//				break;
//			}
//		}

//3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)
//，畫面會顯示他可以選擇的號碼與總數。
//		Scanner sccc = new Scanner(System.in);
//		System.out.println("請輸入不要的數字");
//		int lot = sccc.nextInt();
//		
//		int count = 0;
//		for (int num = 1; num <= 49; num++) {
//		    if (num % 10 != lot && num / 10 != lot) {
//		    	count++;
//		    	if(count % 6 == 0) {
//		    		System.out.print(num + "\t");
//			        System.out.println("");			        
//		    	}else {
//			        System.out.print(num + "\t");
//		    	}
//		    }
//		}
//		System.out.println("總共有 " + count + " 個數字");

//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

		Scanner cccs = new Scanner(System.in);
		System.out.println("請輸入不要的數字");
		int lott = cccs.nextInt();

		int count1 = 0;
		for (int num1 = 1; num1 <= 49; num1++) {
			if (num1 % 10 != lott && num1 / 10 != lott) {
				count1++;
				if (count1 % 6 == 0) {
					System.out.print(num1 + "\t");
					System.out.println("");
				} else {
					System.out.print(num1 + "\t");
				}
			}
		}
		System.out.println("總共有 " + count1 + " 個數字");
//		存到數值到陣列
		int[] luckyNumber = new int[count1];
		int count2 = 0;
		for (int num2 = 1; num2 <= 49; num2++) {
			if (num2 % 10 != lott && num2 / 10 != lott) {
				luckyNumber[count2] = num2;
				count2++;
			}
		}
//		取隨機數值
		int[] randomNumber = new int[6]; //創立有6個元素的一維陣列
		for (int array = 0; array < 6; array++) { 
			int randomIndex = (int) (Math.random() * (count2)); // 宣告0~34的隨機數字
			
			boolean isSame = false;

			for(int layer1 = 0; layer1 < array ; layer1++) {
				if(randomNumber[layer1] == randomIndex) {
				isSame = true;
				break;
				}
			}
			
			if(isSame == false) {
				randomNumber[array] = randomIndex;
				System.out.print(luckyNumber[randomNumber[array]] + " ");
			}
		}
	}
}