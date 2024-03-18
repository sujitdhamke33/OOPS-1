package OOPS.Dog;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanAge() {
        if (age <= 2) {
            return age * 11; // Dogs age faster in the first two years
        } else {
            return 22 + (age - 2) * 5; // After two years, each dog year is equivalent to 5 human years
        }
    }
    public void printDogDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (in human years: " + calculateHumanAge() + " years)");
        System.out.println("Weight: " + weight + " kg");
    }
}
