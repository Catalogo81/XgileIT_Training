//Question 4

package com.packages;

public class Book {
    String title;
    //String authors[] = new String[5];
    String authors;
    int pageNumber, numberOfAuthors;
    float price;
    String publisher;

    public Book() {
        title = "";
        //authors[Integer.parseInt(null)] = "";
        authors = "";
        pageNumber = 0;
        numberOfAuthors = 1;
        price = 0.0f;
        publisher = "";
    }

    public void createBook(String bookTitle, String bookAuthors, int bookPageNumbers, float bookPrice, String bookPublisher)
    {
        title = bookTitle;
        //authors[Integer.parseInt(null)] = bookAuthors;
        authors = bookAuthors;
        pageNumber = bookPageNumbers;
        price = bookPrice;
        publisher = bookPublisher;
    }

//    public String[] getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(String[] authors) {
//        this.authors = authors;
//    }

    public void display()
    {
        String bookAuthor = String.valueOf(authors);
        String bookPublisher = String.valueOf(publisher);
        String bookPrice = String.valueOf(price);
        String bookPageNumber = String.valueOf(pageNumber);

        System.out.println("Author: " + bookAuthor + "\n"
                + "Publisher" + bookPublisher + "\n"
                + "Price: " + bookPrice + "\n"
                + "Page Numbers: " + bookPageNumber);
        System.out.println("------------------------------");
    }
}
