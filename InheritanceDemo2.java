//Multilevel Inheritance – Dynamic Area Calculation

class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 5, breadth = 10;

    double area() {
        return length * breadth;
    }
}

class Box extends Rectangle {
    double height = 2;

    double volume() {
        return area() * height;
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Volume: " + b.volume());
    }
}
