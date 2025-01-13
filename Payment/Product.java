public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " - $" + getTotalPrice();
    }
}
