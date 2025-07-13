class Counter {
    static int count = 0;  // static variable
    int id;

    Counter() {
        count++;
        id = count;
    }

    void display() {
        System.out.println("Object ID: " + id + ", Count: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.display();
        c2.display();
    }
}
