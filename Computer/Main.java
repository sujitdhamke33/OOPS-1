package OOPS.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the processor of the computer:");
        String processor = scanner.nextLine();

        System.out.println("Enter the RAM of the computer (in GB):");
        int ram = scanner.nextInt();

        System.out.println("Enter the storage capacity of the computer (in GB):");
        int storage = scanner.nextInt();

        Computer userComputer = new Computer(processor, ram, storage);

        userComputer.printComputerDetails();

        double totalPrice = userComputer.calculatePrice();
        System.out.println("Total Price: $" + totalPrice);

    }
}
