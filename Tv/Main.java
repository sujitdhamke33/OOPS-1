package OOPS.Tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the brand of the TV:");
        String brand = scanner.nextLine();

        System.out.println("Enter the size of the TV (in inches):");
        int size = scanner.nextInt();

        System.out.println("Enter the original price of the TV:");
        double price = scanner.nextDouble();

        Tv userTV = new Tv (brand, size, price);

        userTV.printTVDetails();

        double discountedPrice = userTV.calculateDiscount();
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
