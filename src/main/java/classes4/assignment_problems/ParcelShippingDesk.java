package classes4.assignment_problems;

abstract class Parcel {
    double weight;
    double declaredValue;

    Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    abstract double calculateCharge();

    abstract double calculateInsurance();

    abstract String getType();

    double getTotal() {
        return calculateCharge() + calculateInsurance();
    }
}

class StandardParcel extends Parcel {

    StandardParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double calculateCharge() {
        return 40 + (10 * weight);
    }

    double calculateInsurance() {
        return 0;
    }

    String getType() {
        return "STANDARD";
    }
}

class ExpressParcel extends Parcel {

    ExpressParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double calculateCharge() {
        return 80 + (15 * weight);
    }

    double calculateInsurance() {
        return declaredValue * 0.02;
    }

    String getType() {
        return "EXPRESS";
    }
}

class FragileParcel extends Parcel {

    FragileParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    double calculateCharge() {
        return 40 + (10 * weight) + 50;
    }

    double calculateInsurance() {
        return declaredValue * 0.02;
    }

    String getType() {
        return "FRAGILE";
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {

        Parcel[] parcels = {
                new StandardParcel(3, 500),
                new ExpressParcel(2, 1000),
                new FragileParcel(4, 2000)
        };

        double grandTotal = 0;

        for (Parcel parcel : parcels) {

            double charge = parcel.calculateCharge();
            double insurance = parcel.calculateInsurance();
            double total = parcel.getTotal();

            System.out.printf(
                    "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    parcel.getType(),
                    charge,
                    insurance,
                    total
            );

            grandTotal = grandTotal + total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}