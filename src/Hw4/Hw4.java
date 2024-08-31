package Hw4;

public class Hw4 {

		public static void main(String[] args) {
//			1.有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//			請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//			int[] xxx = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//			int sum = 0;
//			for(int layer = 0;layer < xxx.length; layer++) {
//				sum += xxx[layer];
//			}
//			System.out.println(sum/xxx.length);
//			
//			int avg = sum/xxx.length;
//			for(int layer2 = 0;layer2 < xxx.length; layer2++) {
//				if(xxx[layer2] > avg) {
//					System.out.print(xxx[layer2]+"\t");
//				}
//			}
			
			
//			System.out.println();
//			2.請建立一個字串，經過程式執行後，輸入結果是反過來的。例如String s = “Hello World”，執行結果即為dlroW olleH
//			輸入
//			Scanner sc = new Scanner(System.in);
//			System.out.println("請輸入");
//			String input = sc.next();
//			
//			int lettersLong = input.length();
//			String inputrevse = "";
//			for(int layer3 = 0; layer3 < lettersLong; layer3++) {
//				inputrevse += input.charAt(lettersLong - layer3 - 1);
//			}
//	  		System.out.print(inputrevse);
//			
//	  		
//			System.out.println();
//			3.有個字串陣列如下(八大行星)：
//			{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//			請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//			String[] rock = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//			int layer4;
//			int layer5;
//			int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
//			for(layer4 = 0; layer4 < rock.length; layer4++) {
//				for(layer5 = 0; layer5 < rock[layer4].length(); layer5++) {
//					if(rock[layer4].charAt(layer5) == 'a' ) {
//						counta++;
//					}else if( rock[layer4].charAt(layer5) == 'e'){
//						counte++;
//					}else if(rock[layer4].charAt(layer5) == 'i'){
//						counti++;
//					}else if(rock[layer4].charAt(layer5) == 'o'){
//						counto++;
//					}else if(rock[layer4].charAt(layer5) == 'u' ){
//						countu++;
//					}else {
//					}
//				}
//			}
//			System.out.println(counta);
//			System.out.println(counte);
//			System.out.println(counti);
//			System.out.println(counto);
//			System.out.println(countu);

//			int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
//			for(String planet : rock) {
//			    for(char c : planet.toCharArray()) {
//			        switch(Character.toLowerCase(c)) {
//			            case 'a': countA++; break;
//			            case 'e': countE++; break;
//			            case 'i': countI++; break;
//			            case 'o': countO++; break;
//			            case 'u': countU++; break;
//			        }
//			    }
//			}
//			System.out.println("a 的數量: " + countA);
//			System.out.println("e 的數量: " + countE);
//			System.out.println("i 的數量: " + countI);
//			System.out.println("o 的數量: " + countO);
//			System.out.println("u 的數量: " + countU);
			
			
//			4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列表如下：	
//			請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入1000 
//			就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
//			Scanner lend = new Scanner(System.in);
//			System.out.print("借多少:");
//			int lendtoWiu = lend.nextInt();
//			
//			int[][] numMoney = {
//					{25,32,8,19,27},
//					{2500,800,500,1000,1200}
//			};
//			System.out.print("有錢可借的員工編號:");
//			int goodPeople = 0;
//			int countPeople = 0;
//			for(int layer6 = 0; layer6 < numMoney[1].length; layer6++) {
//				if(lendtoWiu <= numMoney[1][layer6]) {
//					goodPeople = numMoney[0][layer6];
//					System.out.print(goodPeople + " ");
//					countPeople++;
//				}
//			}
	//
//			System.out.print("共" + countPeople + "人");

//			5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天	
//			例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//			Scanner datesc = new Scanner(System.in);
//			System.out.print("輸入日期:");
//			int dateYear = datesc.nextInt();
//			int dateMonth = datesc.nextInt();
//			int dateDay = datesc.nextInt();
//			
//			int[] countdate1 = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
//			int[] countdate2 = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
//			if(dateYear % 4 != 0 && dateMonth == 2 && dateDay > 28) {
//				System.out.print("月份輸入為2，則日期不該超過29");
//			}else if(dateYear % 4 == 0){
//				System.out.print("輸入的日期為該年第" + (countdate2[(dateMonth-2)] + dateDay) + "天");
//			}else {
//				System.out.print("輸入的日期為該年第" + (countdate1[(dateMonth-2)] + dateDay) + "天");
//			}
			
//			6.班上有8位同學，他們進行了6次考試結果如下：請算出每位同學考最高分的次數
			int[][] test = {
				    {10,35,40,100,90,85,75,70},
				    {37,75,77,89,64,75,70,95},
				    {100,70,79,90,75,70,79,90},
				    {77,95,70,89,60,75,85,89},
				    {98,70,89,90,75,90,89,90},
				    {90,80,100,75,50,20,99,75},
				};

				int[] highestScoreCount = new int[8];  // 用於存儲每個學生獲得最高分的次數

				for (int exam = 0; exam < test.length; exam++) {
				    int maxScore = 0;  // 假設分數不會是負數
				    int[] topStudents = new int[8];  // 用於存儲本次考試獲得最高分的學生
				    int topStudentCount = 0;  // 用於記錄獲得最高分的學生數量

				    // 找出本次考試的最高分
				    for (int score : test[exam]) {
				        if (score > maxScore) {
				            maxScore = score;
				        }
				    }

				    // 找出所有獲得最高分的學生
				    for (int student = 0; student < test[exam].length; student++) {
				        if (test[exam][student] == maxScore) {
				            topStudents[topStudentCount] = student;
				            topStudentCount++;
				        }
				    }

				    // 為獲得最高分的學生增加計數
				    for (int i = 0; i < topStudentCount; i++) {
				        highestScoreCount[topStudents[i]]++;
				    }
				}

				// 輸出結果
				for (int i = 0; i < highestScoreCount.length; i++) {
				    System.out.println("學生 " + (i + 1) + " 獲得最高分的次數: " + highestScoreCount[i]);
				}
			
//			int[][] test = {
//					{10,35,40,100,90,85,75,70},
//					{37,75,77,89,64,75,70,95},
//					{100,70,79,90,75,70,79,90},
//					{77,95,70,89,60,75,85,89},
//					{98,70,89,90,75,90,89,90},
//					{90,80,100,75,50,20,99,75},
//			};	
//			int[][] copytest = {
//					{10,35,40,100,90,85,75,70},
//					{37,75,77,89,64,75,70,95},
//					{100,70,79,90,75,70,79,90},
//					{77,95,70,89,60,75,85,89},
//					{98,70,89,90,75,90,89,90},
//					{90,80,100,75,50,20,99,75},
//			};	
//			int student1 = 0,student2 = 0,student3 = 0,student4 = 0,student5 = 0,student6 = 0,student7 = 0,student8 = 0;
//			
//			int goodStudent;
//			for(int layer7 = 0; layer7 < 6; layer7++) {
//				Arrays.sort(copytest[layer7]);
//				goodStudent = Arrays.binarySearch(test[layer7], copytest[layer7][7]); 
//					System.out.println(goodStudent);
//			    switch( goodStudent + 1) {
//		            case 1: student1++; break;
//		            case 2: student2++; break;
//		            case 3: student3++; break;
//		            case 4: student4++; break;
//		            case 5: student5++; break;
//		            case 6: student6++; break;
//		            case 7: student7++; break;
//		            case 8: student8++; break;
//			        }
//			}
//			System.out.println(student1);
//			System.out.println(student2);
//			System.out.println(student3);
//			System.out.println(student4);
//			System.out.println(student5);
//			System.out.println(student6);
//			System.out.println(student7);
//			System.out.println(student8);
		}
	}
		
		
		
		
//		int xxx;
//		int sss;
//		int[] yyy = {90,80,100,75,50,20,99,75};
	//	
//		Arrays.sort(yyy);
//		sss = Arrays.binarySearch(yyy, 100); 
//		System.out.println(sss);
//		for(int ii = 0; ii < 8; ii++) {
//			System.out.print(test[layer7][ii] + "\t");
//		}
	//	
//		System.out.println();
	//
//		for(int iii = 0; iii < 8; iii++) {
//			System.out.print(copytest[layer7][iii] + "\t");
//		}	
//		System.out.println(copytest[layer7][7]);
	//
	//}



