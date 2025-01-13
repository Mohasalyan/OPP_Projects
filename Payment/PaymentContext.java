public class PaymentContext {
    private PaymentProcessor processor;

    public void setProcessor(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void executePayment(Order order) {
        if (processor == null) {
            throw new IllegalStateException("Payment processor not set.");
        }
        processor.processPayment(order);
    }
}
