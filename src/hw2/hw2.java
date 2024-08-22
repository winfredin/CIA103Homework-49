package hw2;

public class hw2 {
	public static void main(String[] args) {
		// • 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i;
		int sum = 0;
		for (i = 0; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int p;
		int pro = 1;
		for (p = 1; p <= 10; p++) {
			pro *= p;
		}
		System.out.println(pro);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int x = 1;
		int xro = 1;
		while (x <= 10) {
			xro *= x;
			x++;
		}
		System.out.println(xro);

		
		// • 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		int z = 1;
		while (z <= 10) {
			System.out.printf("%d ", z * z);
			z++;
		}

		// • 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int s = 0;
		outer: while (s <= 39) {
			if (s % 10 == 4) {
				s++;
				continue outer;
			}
			System.out.println(s);
			s++;
		}

		// • 請設計一隻Java程式，輸出結果為以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		int u, a;
		for (u = 10; u >= 1; u--) {
			for (a = 1; a <= u; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		// • 請設計一隻Java程式，輸出結果為以下：
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		int j, k;
		for (j = 65; j <= 70; j++) {
			char ch = (char) j;
			for (k = 65; k <= j; k++) {
				System.out.print(ch);
			}
			System.out.println();
		}

		
		// 第2題 for + for
//	int i;
//	int j;
//	for(i = 1; i <= 9 ; i++) {
//		System.out.println();
//		for(j = 1; j <= 9; j++) {
//			System.out.printf("%d * %d = %d	", i, j, i * j);
//		}	
//	}

		// 第2題 for + while
//		int i;
//		for (i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.printf("%d * %d = %d	", i, j, i * j);
//				j++;
//			}
//		System.out.println();
//		}

		// 第2題 for + do while
//		int i;
//		for (i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.printf("%d * %d = %d	", i, j, i * j);
//				j++;
//			} while (j <= 9);
//		System.out.println();
//		}

		// 第2題 while + do while
//		int i = 1;
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.printf("%d * %d = %d	", i, j, i * j);
//				j++;
//			} while (j <= 9);
//		System.out.println();
//		i++;
//		}

	}
}
