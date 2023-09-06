package org.prac;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String title = scanner.next();
        String author = scanner.next();
        float price = scanner.nextFloat();
        Book book = new Book(num,title,author,price);
        System.out.println("Book added : "+num+" "+title+" "+author+" "+price);
        book.getBookNo();
        book.getPrice();
    }

}
