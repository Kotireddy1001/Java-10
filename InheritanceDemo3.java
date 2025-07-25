//Hierarchical Inheritance – User-defined Shapes

import java.util.Scanner;

class ShapeBase {
    double area() { return 0; }
}

class Circle extends ShapeBase {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends ShapeBase {
    double side;

    Square(double s) {
        this.side = s;
    }

    double area() {
        return side * side;
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape (circle/square): ");
        String shape = sc.nextLine();

        ShapeBase s;
        if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter radius: ");
            s = new Circle(sc.nextDouble());
        } else {
            System.out.print("Enter side: ");
            s = new Square(sc.nextDouble());
        }

        System.out.println("Area: " + s.area());
    }
}
