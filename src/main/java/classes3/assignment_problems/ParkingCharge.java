package classes3.assignment_problems;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double calculateCharge();

    abstract String getType();
}

class Bike extends Vehicle {
    Bike(int hours) {
        super(hours);
    }

    double calculateCharge() {
        return hours * 10;
    }

    String getType() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    Car(int hours) {
        super(hours);
    }

    double calculateCharge() {
        return 30 + (hours - 1) * 20;
    }

    String getType() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    Truck(int hours) {
        super(hours);
    }

    double calculateCharge() {
        double charge = hours * 50;

        if (charge < 100) {
            charge = 100;
        }

        return charge;
    }

    String getType() {
        return "TRUCK";
    }
}

public class ParkingCharge {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Bike(3),
                new Car(4),
                new Truck(1),
                new Car(1)
        };

        double total = 0;

        for (Vehicle vehicle : vehicles) {
            double charge = vehicle.calculateCharge();
            System.out.printf("%s: %.2f%n", vehicle.getType(), charge);
            total = total + charge;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}