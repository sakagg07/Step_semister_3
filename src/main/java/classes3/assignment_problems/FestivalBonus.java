package classes3.assignment_problems;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

class InternEmployee extends Employee {
    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return 2000;
    }
}

public class FestivalBonus {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Asha", 50000),
                new PartTimeEmployee("Ravi", 30000),
                new InternEmployee("Neha", 15000)
        };

        double total = 0;

        for (Employee employee : employees) {
            double bonus = employee.calculateBonus();
            System.out.printf("%s: %.2f%n", employee.name, bonus);
            total = total + bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
    }
}