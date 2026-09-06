package string2.class_problems;

import java.util.Scanner;

public class FileExtensionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String file = sc.nextLine();

        int dot = file.lastIndexOf('.');

        if (dot != -1) {
            String extension = file.substring(dot + 1);

            if (extension.equalsIgnoreCase("pdf") ||
                    extension.equalsIgnoreCase("docx") ||
                    extension.equalsIgnoreCase("zip")) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected");
            }
        } else {
            System.out.println("Rejected");
        }
    }
}