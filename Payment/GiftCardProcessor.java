public class GiftCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing payment with Gift Card...");
        System.out.println("Order Total: $" + order.getTotalAmount());
        System.out.println("Gift Card payment successful!");
    }
}
