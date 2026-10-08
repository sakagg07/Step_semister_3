package classes4.assignment_problems;

abstract class Student {
    String name;

    static final double TRANSPORT_FEE = 12000;

    Student(String name) {
        this.name = name;
    }

    abstract double calculateTuition();

    abstract boolean usesBus();

    double calculateFee() {
        double fee = calculateTuition();

        if (usesBus()) {
            fee = fee + TRANSPORT_FEE;
        }

        return fee;
    }
}

class DayScholar extends Student {

    DayScholar(String name) {
        super(name);
    }

    double calculateTuition() {
        return 40000;
    }

    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {

    Hosteller(String name) {
        super(name);
    }

    double calculateTuition() {
        return 40000 + 60000;
    }

    boolean usesBus() {
        return false;
    }
}

class ScholarshipStudent extends Student {

    ScholarshipStudent(String name) {
        super(name);
    }

    double calculateTuition() {
        return 20000;
    }

    boolean usesBus() {
        return true;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {

        Student[] students = {
                new DayScholar("Asha"),
                new Hosteller("Ravi"),
                new ScholarshipStudent("Neha")
        };

        double total = 0;

        for (Student student : students) {

            double fee = student.calculateFee();

            System.out.printf("%s: %.2f%n",
                    student.name, fee);

            total = total + fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
    }
}
