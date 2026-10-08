package classes3.assignment_problems;

import java.time.LocalDate;

abstract class Plan {
    String name;
    LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract int getDays();

    LocalDate getRenewalDate() {
        return startDate.plusDays(getDays());
    }
}

class BasicPlan extends Plan {
    BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 30;
    }
}

class StandardPlan extends Plan {
    StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 90;
    }
}

class PremiumPlan extends Plan {
    PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int getDays() {
        return 365;
    }
}

public class StreamingRenewal {
    public static void main(String[] args) {
        Plan[] plans = {
                new BasicPlan("Asha", LocalDate.of(2024, 1, 15)),
                new StandardPlan("Ravi", LocalDate.of(2024, 2, 1)),
                new PremiumPlan("Neha", LocalDate.of(2024, 3, 10)),
                new BasicPlan("Kiran", LocalDate.of(2024, 12, 20))
        };

        for (Plan plan : plans) {
            System.out.println(plan.name + ": " + plan.getRenewalDate());
        }
    }
}
