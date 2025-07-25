//Hybrid Inheritance Using Interfaces – Dynamic Device Operation

interface PowerOn {
    void turnOn();
}

class Electronic {
    void status() {
        System.out.println("Device is ready.");
    }
}

class Laptop extends Electronic implements PowerOn {
    public void turnOn() {
        System.out.println("Laptop is powering on...");
    }
}

class Mobile extends Electronic implements PowerOn {
    public void turnOn() {
        System.out.println("Mobile is powering on...");
    }
}

public class InheritanceDemo8 {
    public static void main(String[] args) {
        PowerOn device;

        String type = "laptop"; // can make it dynamic via Scanner
        if (type.equalsIgnoreCase("laptop")) {
            device = new Laptop();
        } else {
            device = new Mobile();
        }

        device.turnOn();
        ((Electronic) device).status(); // casting to access parent class method
    }
}
