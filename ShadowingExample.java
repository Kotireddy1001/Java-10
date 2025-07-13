class ShadowingExample {
    int x = 100;

    void show() {
        int x = 50; // local variable shadows instance variable
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }

    public static void main(String[] args) {
        new ShadowingExample().show();
    }
}
