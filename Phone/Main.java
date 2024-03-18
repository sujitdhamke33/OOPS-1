package OOPS.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the make of the phone:");
        String make = scanner.nextLine();

        System.out.println("Enter the model of the phone:");
        String model = scanner.nextLine();

        System.out.println("Enter the storage capacity of the phone (in GB):");
        int storage = scanner.nextInt();

        Phone userPhone = new Phone(make, model, storage);

        userPhone.printPhoneDetails();

        double price = userPhone.calculatePrice();
        System.out.println("Estimated Price: $" + price);


    }
}
