package classes3.assignment_problems;

abstract class Customer {
    double amount;

    Customer(double amount) {
        this.amount = amount;
    }

    abstract double finalAmount();

    abstract String getType();
}

class StudentCustomer extends Customer {
    StudentCustomer(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount * 0.90;
    }

    String getType() {
        return "STUDENT";
    }
}

class StaffCustomer extends Customer {
    StaffCustomer(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount * 0.95;
    }

    String getType() {
        return "STAFF";
    }
}

class GuestCustomer extends Customer {
    GuestCustomer(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount + 10;
    }

    String getType() {
        return "GUEST";
    }
}

public class CanteenBilling {
    public static void main(String[] args) {
        Customer[] customers = {
                new StudentCustomer(200),
                new StaffCustomer(300),
                new GuestCustomer(150)
        };

        double total = 0;

        for (Customer customer : customers) {
            double amount = customer.finalAmount();
            System.out.printf("%s: %.2f%n", customer.getType(), amount);
            total = total + amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
