import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private double totalAmount;

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    private void calculateTotal() {
        totalAmount = products.stream().mapToDouble(Product::getTotalPrice).sum();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order Summary:\n");
        for (Product product : products) {
            sb.append(product).append("\n");
        }
        sb.append("Total: $").append(totalAmount);
        return sb.toString();
    }
}
