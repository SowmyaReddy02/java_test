package org.prac;

import java.util.Scanner;

public class BookDAO {
    Book book[];

    Scanner scanner = new Scanner(System.in);
    public void createBook(Book book[]){
        for(int i=0;i<book.length;i++){
            System.out.println("Enter book details");

            int id = scanner.nextInt();
            String title = scanner.next();
            if(title.length()<4){
                System.out.println("Please enter a value with atleast 4 characters");
                title = scanner.next();
            }
            String author = scanner.next();
            float price = scanner.nextFloat();
                Book b = new Book(id, title, author, price);
                book[i] = b;
        }
    }




}
