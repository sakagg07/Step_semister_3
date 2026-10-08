package classes4.assignment_problems;

abstract class Cab {
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double getRate();

    abstract String getType();

    abstract boolean nightService();

    double calculateFare() {
        double fare = km * getRate();

        if (fare < 100) {
            fare = 100;
        }

        return fare;
    }

    double calculateNightFare() {
        return calculateFare() * 1.20;
    }
}

class MiniCab extends Cab {

    MiniCab(double km) {
        super(km);
    }

    double getRate() {
        return 10;
    }

    String getType() {
        return "MINI";
    }

    boolean nightService() {
        return false;
    }
}

class SedanCab extends Cab {

    SedanCab(double km) {
        super(km);
    }

    double getRate() {
        return 14;
    }

    String getType() {
        return "SEDAN";
    }

    boolean nightService() {
        return true;
    }
}

class SUVCab extends Cab {

    SUVCab(double km) {
        super(km);
    }

    double getRate() {
        return 18;
    }

    String getType() {
        return "SUV";
    }

    boolean nightService() {
        return true;
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {

        Cab[] cabs = {
                new MiniCab(8),
                new SedanCab(10),
                new SUVCab(20),
                new MiniCab(5)
        };

        String[] times = {
                "DAY",
                "NIGHT",
                "DAY",
                "NIGHT"
        };

        double total = 0;

        for (int i = 0; i < cabs.length; i++) {

            Cab cab = cabs[i];

            if (times[i].equals("NIGHT") && !cab.nightService()) {

                System.out.println(
                        cab.getType() + ": night service not available"
                );

            } else {

                double fare;

                if (times[i].equals("NIGHT")) {
                    fare = cab.calculateNightFare();
                } else {
                    fare = cab.calculateFare();
                }

                System.out.printf("%s: %.2f%n",
                        cab.getType(), fare);

                total = total + fare;
            }
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
