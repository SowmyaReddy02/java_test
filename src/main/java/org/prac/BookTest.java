package org.prac;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner =  new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        Book books[]=new Book[0];
        do {
            System.out.println("1. Create a Book");
            System.out.println("2. Read Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                System.out.println("How many books you want to enter");
                int total = scanner.nextInt();
                books = new Book[total];
                bookDAO.createBook(books);
                break;
                case 2:
                    for(Book boo: books){
                        System.out.println(" BookID "+boo.getBookNo()+" Name "+boo.getTitle()+" Author "+boo.getAuthor()+" Price "+boo.getPrice());
                    }
                    break;
                case 3:
                    System .out.println("Enter the book id");
                    int id = scanner.nextInt();

                    for(int i=0;i<books.length;i++){
                        System.out.println(books[i].getBookNo());
                        if(id == books[i].getBookNo()){
                            books[i].setPrice(100);
                        }
                        System.out.println(" BookID "+books[i].getBookNo()+" Name "+books[i].getTitle()+" Author "+books[i].getAuthor()+" Price "+books[i].getPrice());
                    }
                    break;
                case 4:
                    System .out.println("Enter the book id");
                    int bookId = scanner.nextInt();
                    for(int i=0;i<books.length;i++){
                        System.out.println(books[i].getBookNo());
                        if(bookId == books[i].getBookNo()){
                           books[i].setPrice(0);
                           books[i].setAuthor(null);
                           books[i].setTitle(null);
                        }
                        System.out.println("BookID "+books[i].getBookNo()+" Name "+books[i].getTitle()+" Author "+books[i].getAuthor()+" Price "+books[i].getPrice());
                    }

            }



        }while(choice!=5);

    }
}
