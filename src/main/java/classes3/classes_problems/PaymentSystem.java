package classes3.classes_problems;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();

    abstract String getType();
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.02;
    }

    String getType() {
        return "CARD";
    }
}

class WalletPayment extends Payment {
    WalletPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 1.01;
    }

    String getType() {
        return "WALLET";
    }
}

class BankTransferPayment extends Payment {
    BankTransferPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount;
    }

    String getType() {
        return "BANKTRANSFER";
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment(1000),
                new WalletPayment(500),
                new BankTransferPayment(2000)
        };

        double total = 0;

        for (Payment payment : payments) {
            double amount = payment.calculateAmount();
            System.out.printf("%s: %.2f%n", payment.getType(), amount);
            total = total + amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}