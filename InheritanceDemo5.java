class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car created");
    }
}

public class InheritanceDemo5 {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
