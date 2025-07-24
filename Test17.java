//product discount

import java.util.*;

class Product {
    private double price;
    private double discount;

    public void setPrice(double p) { price = p; }
    public void setDiscount(double d) { discount = d; }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }
}

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Enter discount (%): ");
        p.setDiscount(sc.nextDouble());

        System.out.println("Final Price: " + p.getFinalPrice());
    }
}
