package OOPS.Shirt;

import java.util.Scanner;

public class Shirt {

    private double size;
    private String color;

    private double price;

    public Shirt(double size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double discount(){

         double percentageDiscount;
         switch (color.toLowerCase()){
             case "red" :
                 percentageDiscount = 0.15 ;
                 break;
             case "Yellow" :
                 percentageDiscount = 0.10;
                 break;
             default:
                 percentageDiscount = 0.05;
         }
         return price - (price * percentageDiscount);
    }

    void printDetails(){
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color of shirt:");
        String color = scanner.nextLine();

        System.out.println("Enter the size of the shirt:");
        double size = scanner.nextDouble();

        System.out.println("Enter the price of the shirt:");
        double price = scanner.nextDouble();

        Shirt reymond = new Shirt(size,color,price);
        reymond.printDetails();
        double discount = reymond.discount();
        System.out.println("Amount after the Discount : $" + discount);
    }
}
