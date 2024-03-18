package OOPS.Furniture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of furniture:");
        String type = scanner.nextLine();

        System.out.println("Enter the material of the furniture:");
        String material = scanner.nextLine();

        System.out.println("Enter the price of the furniture:");
        double price = scanner.nextDouble();

        Furniture userFurniture = new Furniture(type, material, price);

        userFurniture.printFurnitureDetails();

        double discountAmount = userFurniture.calculateDiscount();
        System.out.println("Discount Amount: $" + discountAmount);


    }
}
