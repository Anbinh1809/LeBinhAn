public class Smartphone extends Product {
    private double weight;

    public Smartphone() {
        super();
    }

    public Smartphone(String id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Loại: Smartphone | Trọng lượng: %,.1f g%n", weight);
    }

    @Override
    public String toString() {
        return String.format("Smartphone [%s, weight=%.1fg]", super.toString(), weight);
    }
}
