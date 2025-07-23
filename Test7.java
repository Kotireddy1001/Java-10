//Car speed controller

class Car {
    private int speed;

    public void setSpeed(int s) {
        if (s >= 0) speed = s;
    }

    public int getSpeed() {
        return speed;
    }
}

public class Test7 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(80);
        System.out.println("Speed: " + c.getSpeed() + " km/h");
    }
}
