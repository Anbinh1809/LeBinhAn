public class Laptop extends Product {
    private String brand;

    public Laptop() {
        super();
    }

    public Laptop(String id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Loại: Laptop     | Nhãn hiệu: %-15s%n", brand);
    }

    @Override
    public String toString() {
        return String.format("Laptop [%s, brand=%s]", super.toString(), brand);
    }
}
