package classes4.assignment_problems;

abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double getPower();

    abstract String getType();

    abstract boolean saverSupported();

    double calculateUnits() {
        return (getPower() * hours) / 1000;
    }

    double calculateSaverUnits() {
        return calculateUnits() * 0.75;
    }

    double calculateCost(double units) {
        return units * 8;
    }
}

class Fridge extends Appliance {

    Fridge(double hours) {
        super(hours);
    }

    double getPower() {
        return 150;
    }

    String getType() {
        return "FRIDGE";
    }

    boolean saverSupported() {
        return false;
    }
}

class AC extends Appliance {

    AC(double hours) {
        super(hours);
    }

    double getPower() {
        return 1500;
    }

    String getType() {
        return "AC";
    }

    boolean saverSupported() {
        return true;
    }
}

class TV extends Appliance {

    TV(double hours) {
        super(hours);
    }

    double getPower() {
        return 100;
    }

    String getType() {
        return "TV";
    }

    boolean saverSupported() {
        return false;
    }
}

class Washer extends Appliance {

    Washer(double hours) {
        super(hours);
    }

    double getPower() {
        return 500;
    }

    String getType() {
        return "WASHER";
    }

    boolean saverSupported() {
        return true;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {

        Appliance[] appliances = {
                new Fridge(24),
                new AC(8),
                new TV(5),
                new Washer(2)
        };

        boolean[] saver = {
                false,
                true,
                false,
                true
        };

        double total = 0;

        for (int i = 0; i < appliances.length; i++) {

            Appliance appliance = appliances[i];

            if (saver[i] && !appliance.saverSupported()) {

                System.out.println(
                        appliance.getType() +
                                ": saver mode not supported"
                );

            } else {

                double units;

                if (saver[i]) {
                    units = appliance.calculateSaverUnits();
                } else {
                    units = appliance.calculateUnits();
                }

                double cost = appliance.calculateCost(units);

                System.out.printf(
                        "%s: Units=%.2f Cost=%.2f%n",
                        appliance.getType(),
                        units,
                        cost
                );

                total = total + cost;
            }
        }

        System.out.printf("Total Cost: %.2f%n", total);
    }
}