package HwExt;

public class HwExt {
	    public static void main(String[] args) {
	        Pen pencil = new Pencil("鉛筆品牌", 100); // 定價 100
	        Pen inkBrush = new InkBrush("墨水筆品牌", 200); // 定價 200

	        // 多型操作
	        System.out.println("Pencil:");
	        pencil.write(); // 輸出: 削鉛筆再寫
	        System.out.println("品牌: " + pencil.getBrand());
	        System.out.println("售價: " + pencil.getPrice());

	        System.out.println("InkBrush:");
	        inkBrush.write(); // 輸出: 沾墨汁再寫
	        System.out.println("品牌: " + inkBrush.getBrand());
	        System.out.println("售價: " + inkBrush.getPrice());
	    }
	}
