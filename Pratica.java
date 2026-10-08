
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Transferência Bancária");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                paymentContext.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                paymentContext.setPaymentStrategy(new PayPalPayment());
                break;
            case 3:
                paymentContext.setPaymentStrategy(new BankTransferPayment());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("Digite o valor do pagamento: ");
        double amount = scanner.nextDouble();

        paymentContext.processPayment(amount);
    }
}