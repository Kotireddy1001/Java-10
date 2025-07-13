class Product {
    final int id;
    String name;

    Product(int id, String name) {
        this.id = id; // final variable initialized
        this.name = name;
    }

    void display() {
        System.out.println("Product ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Keyboard");
        p.display();
    }
}
