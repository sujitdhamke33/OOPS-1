package OOPS.Phone;

public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {

        double basePrice = 5000;
        double storagePrice = storage * 1000;

        if (make.equalsIgnoreCase("Apple")) {
            basePrice += 3000;
        } else if (make.equalsIgnoreCase("Samsung")) {
            basePrice += 2000; // Additional price for Samsung phones
        } else{
            basePrice += 0;
        }

        return basePrice + storagePrice;
    }

    public void printPhoneDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
    }


}
