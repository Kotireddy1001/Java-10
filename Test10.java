//ATM PIN Validation

class ATM {
    private int pin = 1234;

    public boolean validatePin(int inputPin) {
        return pin == inputPin;
    }
}

public class Test10 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        boolean isValid = atm.validatePin(1234);
        System.out.println("Access granted: " + isValid);
    }
}
