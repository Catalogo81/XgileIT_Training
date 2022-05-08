//Question 8

package com.packages;

public class BookShop {

    Books_[] books_ = new Books_[1];

    public BookShop()
    {
        books_[0] = new Books_();
    }

    public void add(String author, String title, String publisher, int stockPosition, double cost) {

        Books_ b = new Books_(author,title,publisher,stockPosition,cost);

        int numberOfBooks = books_.length;

        Books_ newPublisher[] = new Books_[numberOfBooks + 1];

        for (int i = 0; i < numberOfBooks; i++)
            newPublisher[i] = books_[i];

        newPublisher[numberOfBooks] = b;

        books_ = newPublisher;
    }

    public void buy(String author, String title, int stckp) {

        for (int j = 0; j < books_.length; j++) {
            if (title.equalsIgnoreCase(books_[j].title) && author.equalsIgnoreCase(books_[j].author)) {
                books_[j].displayDetails();
                if (books_[j].stockPosition < stckp) {
                    System.out.println("required copies not in stock");
                    return;
                }
                System.out.println("Total Cost:- " + books_[j].cost * stckp);
                return;
            }
        }
        System.out.println("book not found");
        {
        }
    }

    public static void main(String[] args) {

        BookShop bookShops = new BookShop();

        bookShops.add("kgotso", "Heaven", "New York", 4, 453.5);

    }
}
