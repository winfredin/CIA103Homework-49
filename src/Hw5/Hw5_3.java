package Hw5;

public class Hw5_3 {
//	3利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，	可以找出二維陣列的最大值並回傳
	public static void maxElement(int[][] x) {
	    int max = 0; 
	    for (int i = 0; i < x.length; i++) {
	        for (int j = 0; j < x[i].length; j++) {
	            if (x[i][j] > max) {
	                max = x[i][j];
	            }
	        }
	    }
	    System.out.println("Max in intArray: " + max); 
	}
	
	public static void maxElement(double[][] y) {
		double max = 0; 
	    for (int i = 0; i < y.length; i++) {
	        for (int j = 0; j < y[i].length; j++) {
	            if (y[i][j] > max) {
	                max = y[i][j];
	            }
	        }
	    }
	    System.out.println("Max in intArray: " + max); 
	}
	
	public static void main(String[] args) {
		int[][] xx = {
				{1,100,200},
				{2,101,555},
				{3,102,550}
		};
		double[][] yy = {
				{1.5,100.9,200.11},
				{2.2,101.0,555.55},
				{1.9,105.9,205.11}
		};
		
		maxElement(xx) ;
		maxElement(yy) ;

	}

}
