package BooksManagementSystem;

/**
 * Created with IntelliJ IDEA.
 * Description:书这个类
 * User: liaoyueyue
 * Date: 2022-05-22
 * Time: 22:46
 */
public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isborrowed;

    public Book(String name, String author, double price, String type){
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsborrowed() {
        return isborrowed;
    }

    public void setIsborrowed(boolean isborrowed) {
        this.isborrowed = isborrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isborrowed=" + isborrowed +
                '}';
    }
}
