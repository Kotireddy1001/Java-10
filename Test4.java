//Book Information

class Book {
    private String title;
    private String author;

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setAuthor("John Smith");
        System.out.println(b.getTitle() + " by " + b.getAuthor());
    }
}
