
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Define a estratégia de pagamento
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Processa o pagamento
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de pagamento definida.");
        }
        paymentStrategy.pay(amount);
    }
}