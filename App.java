import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Laptop("LT01", "MacBook Pro M3", 45000000, "Apple"));
        products.add(new Laptop("LT02", "Dell XPS 13", 35000000, "Dell"));
        products.add(new Smartphone("SP01", "iPhone 15 Pro", 28000000, 187.0));
        products.add(new Smartphone("SP02", "Samsung Galaxy S24", 23000000, 167.0));
        products.add(new Tablet("TB01", "iPad Air 5", 16000000, 10.9));

        System.out.println("============================== DANH SÁCH SẢN PHẨM ==============================");
        for (Product product : products) {
            product.displayInfo();
        }
        System.out.println("================================================================================");
    }
}
