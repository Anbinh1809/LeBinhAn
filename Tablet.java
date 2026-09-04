public class Tablet extends Product {
    private double screenSize;

    public Tablet() {
        super();
    }

    public Tablet(String id, String name, double price, double screenSize) {
        super(id, name, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

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
