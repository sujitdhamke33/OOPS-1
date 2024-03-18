package OOPS.Tv;

public class Tv {
    private String Brand;
    private int Size;
    private double Price;

    public Tv(String brand, int size, double price) {
        this.Brand = brand;
        this.Size = size;
        this.Price = price;
    }

    public double calculateDiscount() {

        double discountPercentage = 0;

        if (Size <= 32) {
            discountPercentage = 5; // 5% discount for TVs with size 32 inches or smaller
        } else if (Size <= 48) {
            discountPercentage = 10; // 10% discount for TVs with size between 33 and 50 inches
        } else {
            discountPercentage = 15; // 15% discount for TVs with size larger than 50 inches
        }

        return Price - (Price * discountPercentage / 100);
    }

    public void printTVDetails() {
        System.out.println("Brand: " + Brand);
        System.out.println("Size: " + Size + " inches");
        System.out.println("Original Price: $" + Price);
    }
}
