package OOPS.Employee;

public class Employee {
    private String name;
    private int salary;
    private int ID;

    public void yearlySalary(int salary){
        int Yearlysalary = 12 * salary;
        System.out.println("Yearly salary is : " + Yearlysalary);
    }
public void detailsEmployee(String name , int salary){
    System.out.println("Name :"+ name);
    System.out.println("Salary :"+ salary);
}
}
