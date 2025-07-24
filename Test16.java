//Book Details

import java.util.*;

class Book {
    private String title;
    private double price;

    public void setTitle(String t) { title = t; }
    public void setPrice(double p) { price = p; }

    public String getTitle() { return title; }
    public double getPrice() { return price; }
}

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.print("Enter title: ");
        b.setTitle(sc.nextLine());

        System.out.print("Enter price: ");
        b.setPrice(sc.nextDouble());

        System.out.println("Book: " + b.getTitle() + ", Price: " + b.getPrice());
    }
}
