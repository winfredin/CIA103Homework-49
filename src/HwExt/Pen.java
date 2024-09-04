package HwExt;


public abstract class Pen {
    private String brand; // 品牌
    private double price; // 價格

    // 無參數建構子
    public Pen() {
        this.brand = "未知品牌";
        this.price = 0.0;
    }

    // 根據屬性設計的建構子
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 抽象方法
    public abstract void write();
}