package OOPS.student;

public class Student {
   private String name;
   private int age;
   private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

  public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("id: " + id);
    }
}
