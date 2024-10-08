package HW2;

public class HW2 {
	public static void main(String[] args) {
		// • 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		System.out.println("第1題");
		int q;
		int sum = 0;
		for (q = 0; q <= 1000; q += 2) {
			sum += q;
		}
		System.out.println(sum);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		System.out.println("第2題");
		int p;
		int pro = 1;
		for (p = 1; p <= 10; p++) {
			pro *= p;
		}
		System.out.println(pro);

		// • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		System.out.println("第3題");
		int x = 1;
		int xro = 1;
		while (x <= 10) {
			xro *= x;
			x++;
		}
		System.out.println(xro);

		// • 請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		System.out.println("第4題");
		int z = 1;
		while (z <= 10) {
			System.out.printf("%d ", z * z);
			z++;
		}
		System.out.println("");

		// • 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.println("第5題");
		int count = 0;
		for (int i = 1; i <= 49; i++) {
		    if (i % 10 != 4 && i / 10 != 4) {
		        System.out.print(i + " ");
		        count++;
		    }
		}
		System.out.println("\n總共有 " + count + " 個數字");
		
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
		System.out.println("第6題");
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
		System.out.println("第7題");
		int j, k;
		for (j = 65; j <= 70; j++) {
			char ch = (char) j;
			for (k = 65; k <= j; k++) {
				System.out.print(ch);
			}
			System.out.println();
		}

		// 第2題 for + for
		System.out.println("隨堂練習第2題M1");
		int A;
		int B;
		for (A = 1; A <= 9; A++) {
			for (B = 1; B <= 9; B++) {
				System.out.printf("%d * %d = %d	", A, B, A * B);
			}
			System.out.println();
		}

		// 第2題 for + while
		System.out.println("隨堂練習第2題M2");
		int C;
		for (C = 1; C <= 9; C++) {
			int D = 1;
			while (D <= 9) {
				System.out.printf("%d * %d = %d	", C, D, C * D);
				D++;
			}
			System.out.println();
		}

		// 第2題 for + do while
		System.out.println("隨堂練習第2題M3");
		int E;
		for (E = 1; E <= 9; E++) {
			int F = 1;
			do {
				System.out.printf("%d * %d = %d	", E, F, E * F);
				F++;
			} while (F <= 9);
			System.out.println();
		}

		// 第2題 while + do while
		System.out.println("隨堂練習第2題M4");
		int G = 1;
		while (G <= 9) {
			int H = 1;
			do {
				System.out.printf("%d * %d = %d	", G, H, G * H);
				H++;
			} while (H <= 9);
			System.out.println();
			G++;
		}

	}
}
