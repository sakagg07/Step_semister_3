package classes3.classes_problems;

abstract class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    abstract String getType();
}

class Bus extends Transport {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        double fare = 2 + (0.10 * distance);

        if (fare > 10) {
            fare = 10;
        }

        return fare;
    }

    String getType() {
        return "BUS";
    }
}

class Train extends Transport {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 3 + (0.15 * distance);
    }

    String getType() {
        return "TRAIN";
    }
}

class Metro extends Transport {
    double peakHourFactor;

    Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    double calculateFare() {
        return (1.50 + (0.20 * distance)) * peakHourFactor;
    }

    String getType() {
        return "METRO";
    }
}

public class TransportFare {
    public static void main(String[] args) {
        Transport[] transports = {
                new Bus(15),
                new Train(50),
                new Metro(10, 1.5)
        };

        double total = 0;

        for (Transport transport : transports) {
            double fare = transport.calculateFare();
            System.out.printf("%s: %.2f%n", transport.getType(), fare);
            total = total + fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}