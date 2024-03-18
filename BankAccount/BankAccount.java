package OOPS.BankAccount;

public class BankAccount {
    int balance ;
    long account_number;


    public void deposit(int depositeAmount){
        balance = balance + depositeAmount;
        System.out.println("Your balance is :" + balance);
    }

    public void withdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
        System.out.println("Your withdrawal of " + withdrawAmount + " is Succesful...!");
        System.out.println("Your balance after withdrawal is :" + balance);
    }
}
