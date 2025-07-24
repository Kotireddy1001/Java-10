//Bank Account

import java.util.*;

class Bank {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() { return balance; }
}

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter deposit amount: ");
        b.deposit(sc.nextDouble());

        System.out.println("Updated Balance: " + b.getBalance());
    }
}
