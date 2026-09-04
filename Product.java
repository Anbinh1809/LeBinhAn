public class Product {
    private String id;
    private String name;
    private double price;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display method
    public void displayInfo() {
        System.out.printf("Mã SP: %-8s | Tên SP: %-25s | Giá: %,.0f VNĐ", id, name, price);
    }

    @Override
    public String toString() {
        return String.format("Product [id=%s, name=%s, price=%,.0f VNĐ]", id, name, price);
    }
}
