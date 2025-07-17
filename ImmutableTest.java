final class BankAccount {
    private final String accNumber;
    private final double balance;

    public BankAccount(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccNumber() { return accNumber; }
    public double getBalance() { return balance; }
}

public class ImmutableTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SB123456", 5000.0);
        System.out.println("Account: " + acc.getAccNumber());
        System.out.println("Balance: ₹" + acc.getBalance());
    }
}
