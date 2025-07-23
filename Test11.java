//Product discount calculator

class Product {
    private double price;
    private double discount; // in %

    public void setPrice(double p) {
        price = p;
    }

    public void setDiscount(double d) {
        discount = d;
    }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }
}

public class Test11 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(1000);
        p.setDiscount(10);
        System.out.println("Final Price: " + p.getFinalPrice());
    }
}
