public class CreditCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing payment with Credit Card...");
        System.out.println("Order Total: $" + order.getTotalAmount());
        System.out.println("Credit Card payment successful!");
    }
}
