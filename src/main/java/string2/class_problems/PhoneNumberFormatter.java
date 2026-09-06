package string2.class_problems;

import java.util.Scanner;

public class PhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (phone.length() == 10) {
            boolean valid = true;

            for (int i = 0; i < phone.length(); i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    valid = false;
                }
            }

            if (valid) {
                StringBuilder result = new StringBuilder("XXXXXX");
                result.append("-");
                result.append(phone.substring(6));

                System.out.println(result);
            } else {
                System.out.println("Invalid phone number");
            }
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
