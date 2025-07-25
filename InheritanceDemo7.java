// Interface + Inheritance – Dynamic Payment Method

import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class InheritanceDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Choose payment method (credit/upi): ");
        String method = sc.nextLine();

        Payment p;
        if (method.equalsIgnoreCase("credit"))
            p = new CreditCard();
        else
            p = new UPI();

        p.pay(amount);
    }
}
