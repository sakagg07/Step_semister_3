package string2.class_problems;

import java.util.Scanner;

public class TransactionReferenceValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String ref = sc.nextLine().trim().toUpperCase();

        if (ref.length() == 14) {
            boolean valid = true;

            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(ref.charAt(i))) {
                    valid = false;
                }
            }

            for (int i = 3; i < 14; i++) {
                if (!Character.isDigit(ref.charAt(i))) {
                    valid = false;
                }
            }

            if (valid) {
                StringBuilder result = new StringBuilder();
                result.append(ref.substring(0, 3));
                result.append("-");
                result.append(ref.substring(3, 11));
                result.append("-");
                result.append(ref.substring(11));

                System.out.println(result);
            } else {
                System.out.println("Invalid reference");
            }
        } else {
            System.out.println("Invalid reference");
        }
    }
}