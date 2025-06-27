package oOP;

public class Bankmain {
    public static void main(String[] args) {
        Bank_Account acc = new Bank_Account("Ashu");
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(600); // ስህተት መግለጫ
    }
}
