package HwExt;

public class InkBrush extends Pen {
    // InkBrush 的建構子
    public InkBrush(String brand, double price) {
        super(brand, price * 0.9); // 實際售價為定價的 9 折
    }

    @Override
    public void write() {
        System.out.println("沾墨汁再寫");
    }
}