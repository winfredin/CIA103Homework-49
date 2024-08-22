package hw1;

public class hw1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("第1題");
		int num1 = 12;
		int num2 = 6;
		int sum = num1 + num2;
		int pro = num1 * num2;
		System.out.println(sum);
		System.out.println(pro);		
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("第2題");
		int egg = 200;
		System.out.printf("200顆蛋是%d打%n", egg / 12); 
		System.out.printf("200顆蛋是%d顆%n", egg % 12); 
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒 天86400 時3600 分60
		System.out.println("第3題");
		int time = 256559;
		int days = time / 86400;
		int hours = (time % 86400) / 3600;
		int minites = (time % 86400) % 3600 / 60;
		int second = (time % 86400) % 3600 % 60;
		System.out.printf("256559秒有%d天%n", days); 
		System.out.printf("256559秒有%d小時%n", hours);
		System.out.printf("256559秒有%d分%n", minites); 
		System.out.printf("256559秒有%d秒%n", second); 
		//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		System.out.println("第4題");
		final double  PI= 3.14159;
		double r = 5;
		double area = r * r * PI;
		double per = 2 * r * PI;
		System.out.printf("圓面積%.3f%n", area); 
		System.out.printf("圓周長%.3f%n", per); 
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢(用複利計算，公式請自行google)
		System.out.println("第5題");
		double save = 1_500_000;
		double rates = 0.02;
		double years = 10.0;
		double Totals  = save * Math.pow((1 + rates), years);
		System.out.printf("本金加本利和有%.1f元%n", Totals); 
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		並請用註解各別說明答案的產生原因	
		System.out.println("第6題");
//		5 + 5
		System.out.println(5+5);
		//預設資料型態皆為INT，進行數值相加，輸出結果為5
//		5 + ‘5’
		System.out.println(5+'5');
		//5預設為int，'5'在Unicode Table表上為35(十六進位)轉十進位等於53，故答案為5+53=58
//		5 + “5”
		System.out.println(5+"5");
		//5為int型態，"5"為String型態，相加會進行串接，型態輸出會強制轉型成String，故答案為55

		
	}
}
