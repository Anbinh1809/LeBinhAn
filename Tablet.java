public class Tablet extends Product {
    private double screenSize; // Kích thước màn hình (inch)

    // Default constructor
    public Tablet() {
        super();
    }

    // Full-argument constructor
    public Tablet(String id, String name, double price, double screenSize) {
        super(id, name, price);
        this.screenSize = screenSize;
    }

    // Getter and Setter
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Loại: Tablet     | Kích thước MH: %,.1f inch%n", screenSize);
    }

    @Override
    public String toString() {
        return String.format("Tablet [%s, screenSize=%.1f inch]", super.toString(), screenSize);
    }
}
