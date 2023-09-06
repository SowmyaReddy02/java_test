package org.prac;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Num : "+bookNo+" Title "+title+ " Author "+author+" price "+price);
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length()>3) {
            this.title = title;
        }else{
            System.out.println("Enter the title with atleast 4 characters");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price>0 && price<=5000) {
            this.price = price;
        }else{
            System.out.println("Enter price in range 1 to 5000");
        }
    }

}

class EngineeringBook extends Book{
    int bookNo;
    String title;
    String author;
    float price;
    private String category;

    public EngineeringBook(int bookNo, String title, String author, float price, String category) {
        super(bookNo, title, author, price);
        this.category = category;
        System.out.print("Cat : "+category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class Test{
    public static void main(String[] args) {
        EngineeringBook engineeringBook = new EngineeringBook(1,"java","james",100,"lang");
    }
}