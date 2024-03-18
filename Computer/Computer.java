package OOPS.Computer;

public class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public double calculatePrice() {

        double basePrice = 800;


        double processorCost = 0.2 * basePrice; // 20% of base price
        double ramCost = 0.1 * basePrice; // 10% of base price
        double storageCost = 0.15 * basePrice; // 15% of base price

        return basePrice + processorCost + ramCost + storageCost;
    }

    public void printComputerDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

}
