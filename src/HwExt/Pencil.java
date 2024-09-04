package HwExt;

public class Pencil extends Pen {
    // Pencil 的建構子
    public Pencil(String brand, double price) {
        super(brand, price * 0.8); // 實際售價為定價的 8 折
    }

    @Override
    public void write() {
        System.out.println("削鉛筆再寫");
    }
}