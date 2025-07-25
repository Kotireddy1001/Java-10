import java.util.Scanner;

abstract class Account {
    abstract void accountType();
}

class Savings extends Account {
    void accountType() {
        System.out.println("Savings Account");
    }
}

class Current extends Account {
    void accountType() {
        System.out.println("Current Account");
    }
}

public class InheritanceDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose account (savings/current): ");
        String input = sc.nextLine();

        Account acc;
        if (input.equalsIgnoreCase("savings"))
            acc = new Savings();
        else
            acc = new Current();

        acc.accountType();
    }
}
