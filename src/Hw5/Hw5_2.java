package Hw5;

public class Hw5_2 {
//	2 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	static void randAvg() {
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			int random1 = (int)(Math.random()*101);
			sum += random1;
			System.out.print(random1 + "\t");
		}
		System.out.println();
		double avg = sum/10.0;
		System.out.print(avg);
	}
	
	
	public static void main(String[] args) {
		randAvg();
	}

}
