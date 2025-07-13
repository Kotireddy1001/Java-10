class Rectangle1 {
    int length, breadth, area;

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth; // dynamic initialization
    }

    void display() {
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(5, 7);
        r.display();
    }
}
