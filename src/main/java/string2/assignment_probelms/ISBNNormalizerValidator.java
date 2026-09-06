package string2.assigment_problems;

import java.util.Scanner;

public class ISBNNormalizerValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine().trim().toUpperCase();

        if (isbn.length() == 13) {
            boolean valid = true;

            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(isbn.charAt(i))) {
                    valid = false;
                }
            }

            for (int i = 3; i < 13; i++) {
                if (!Character.isDigit(isbn.charAt(i))) {
                    valid = false;
                }
            }

            if (valid) {
                System.out.println("Valid ISBN");
                System.out.println("[" + isbn.substring(0, 3) + "] " +
                        isbn.substring(3, 7) + ": " +
                        isbn.substring(7));
            } else {
                System.out.println("Invalid ISBN");
            }
        } else {
            System.out.println("Invalid ISBN");
        }
    }
}
