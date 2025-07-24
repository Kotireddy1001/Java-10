//Circle area

import java.util.*;

class Circle {
    private double radius;

    public void setRadius(double r) {
        if (r > 0) radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.setRadius(sc.nextDouble());

        System.out.println("Area: " + c.getArea());
    }
}
