
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

   
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de pagamento definida.");
        }
        paymentStrategy.pay(amount);
    }
}