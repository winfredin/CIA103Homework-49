package Hw5;

public class MyRectangleMain {
//	4 請另外建立一個MyRectangleMain類別，此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
        // (1) 使用無參數建構子建立物件
        MyRectangle cons1 = new MyRectangle();
        cons1.setWidth(10);
        cons1.setDepth(20);
        System.out.println("面積 (無參數建構子): " + cons1.getArea());

        // (2) 使用帶參數建構子建立物件
        MyRectangle cons2 = new MyRectangle(10, 20);
        System.out.println("面積 (帶參數建構子): " + cons2.getArea());
        
//		public MyRectangle(10, 20);		
		
	}
}
