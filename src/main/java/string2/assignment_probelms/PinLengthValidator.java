package string2.assigment_problems;

import java.util.Scanner;

public class PinLengthValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (pin.length() == 4 || pin.length() == 6) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }
}