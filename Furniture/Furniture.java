package OOPS.Furniture;

import java.util.Scanner;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscount() {

        double discountPercentage;

        switch (material.toLowerCase()) {
            case "wood":
                discountPercentage = 0.15;
                break;
            case "metal":
                discountPercentage = 0.1;
                break;
            default:
                discountPercentage = 0.05;
                break;
        }

        return price * discountPercentage;
    }

    public void printFurnitureDetails() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
    }
}
