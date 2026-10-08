// Implementação de pagamento com cartão de crédito
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com cartão de crédito.");
    }
}