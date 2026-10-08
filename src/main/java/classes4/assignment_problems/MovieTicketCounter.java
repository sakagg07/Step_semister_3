package classes4.assignment_problems;

abstract class Ticket {
    int count;

    static final double CONVENIENCE_FEE = 20;

    Ticket(int count) {
        this.count = count;
    }

    abstract double getPrice();

    double getTotal() {
        return (getPrice() + CONVENIENCE_FEE) * count;
    }

    abstract String getType();
}

class RegularTicket extends Ticket {

    RegularTicket(int count) {
        super(count);
    }

    double getPrice() {
        return 150;
    }

    String getType() {
        return "REGULAR";
    }
}

class PremiumTicket extends Ticket {

    PremiumTicket(int count) {
        super(count);
    }

    double getPrice() {
        return 250;
    }

    String getType() {
        return "PREMIUM";
    }
}

class ReclinerTicket extends Ticket {

    ReclinerTicket(int count) {
        super(count);
    }

    double getPrice() {
        return 400;
    }

    String getType() {
        return "RECLINER";
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {

        Ticket[] tickets = {
                new RegularTicket(3),
                new PremiumTicket(2),
                new ReclinerTicket(1)
        };

        double total = 0;

        for (Ticket ticket : tickets) {
            double amount = ticket.getTotal();

            System.out.printf("%s: %.2f%n",
                    ticket.getType(), amount);

            total = total + amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
