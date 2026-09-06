package string2.assigment_problems;

import java.util.Scanner;

public class InventoryCSVParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product record: ");
        String record = sc.nextLine();

        String[] data = record.split(",");

        if (data.length == 3) {
            System.out.println("Product: " + data[0]);
            System.out.println("Quantity: " + data[1]);
            System.out.println("Price: " + data[2]);
        } else {
            System.out.println("Invalid record");
        }
    }
}