public class Main {
    public static void main(String[] args) {
        // Create products
        Product mask = new Product("Mask", 10, 2.5);
        Product sanitizer = new Product("Sanitizer", 5, 3.0);

        // Create an order
        Order order = new Order();
        order.addProduct(mask);
        order.addProduct(sanitizer);

        System.out.println(order);

        // Payment context
        PaymentContext paymentContext = new PaymentContext();

        // Process payment with Credit Card
        paymentContext.setProcessor(new CreditCardProcessor());
        paymentContext.executePayment(order);

        // Process payment with Gift Card
        paymentContext.setProcessor(new GiftCardProcessor());
        paymentContext.executePayment(order);
    }
}
