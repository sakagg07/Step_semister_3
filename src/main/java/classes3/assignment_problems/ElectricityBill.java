package classes3.assignment_problems;

abstract class Room {
    int units;

    Room(int units) {
        this.units = units;
    }

    abstract double calculateBill();

    abstract String getType();
}

class SingleRoom extends Room {
    SingleRoom(int units) {
        super(units);
    }

    double calculateBill() {
        return units * 8;
    }

    String getType() {
        return "SINGLE";
    }
}

class SharedRoom extends Room {
    int occupants;

    SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double calculateBill() {
        return (units * 6) / occupants;
    }

    String getType() {
        return "SHARED";
    }
}

class AcRoom extends Room {
    AcRoom(int units) {
        super(units);
    }

    double calculateBill() {
        return units * 10 + 200;
    }

    String getType() {
        return "AC";
    }
}

public class ElectricityBill {
    public static void main(String[] args) {
        Room[] rooms = {
                new SingleRoom(120),
                new SharedRoom(150, 3),
                new AcRoom(100)
        };

        double total = 0;

        for (Room room : rooms) {
            double bill = room.calculateBill();
            System.out.printf("%s: %.2f%n", room.getType(), bill);
            total = total + bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}