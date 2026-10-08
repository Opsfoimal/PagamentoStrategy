// Implementação de pagamento com transferência bancária
public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado por transferência bancária.");
    }
}