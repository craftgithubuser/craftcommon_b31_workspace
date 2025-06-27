package oOP;


public class Bank_Account {
    private String owner;
    private double balance;

    public Bank_Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " ብር ተደምሯል። አዲስ ሒሳብ: " + balance);
        } else {
            System.out.println("ያስገቡት መጠን አያስፈልግም።");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " ብር ተቀምሷል። አዲስ ሒሳብ: " + balance);
        } else {
            System.out.println("በቂ ገንዘብ የለም!");
        }
    }
}
