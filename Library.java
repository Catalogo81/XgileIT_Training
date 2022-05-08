//Question 4

package com.packages;

public class Library
{
    Book[] books;
    int i;
    int amountOfBooks;

    public Library(int numberOfBooks)
    {
        books = new Book[numberOfBooks];
        i = 0;
        for(i = 0; i < numberOfBooks; i++)
        {
            books[i] = new Book();
        }
    }

    public Library()
    {
        books = new Book[5];
        i = 0;
        for(i = 0; i < 5; i++)
        {
            books[i] = new Book();
        }
    }

    public void add(String bookTitle, String listOfAuthors, int bookPageNumber, float bookPrice, String bookPublisher)
    {
       books[amountOfBooks].createBook(bookTitle, listOfAuthors, bookPageNumber, bookPrice, bookPublisher);
       amountOfBooks++;
    }

    public void remove()
    {
        amountOfBooks--;
    }

    public void add()
    {
        amountOfBooks++;
    }

    public void display()
    {
        //displays the total books in the library
        for (int i = 0; i < amountOfBooks; i++) {
            books[i].display();
        }

    }

    public static void main(String[] args)
    {
        //creates the Library
        Library library = new Library(5);

        //this will create the amount of books you want to create
        library.add("Lost woods", "adwed", 152, 55566.44F, "Makontso");
        library.add("Jungle Book", "sfas", 587, 55776.44F, "Makontso");
        library.add("Heaven", "efe", 55, 556.44F, "Makontso");
        library.add("Graduations", "sdvds", 54, 5561.44F, "Makontso");
        library.add("Central University of Thechnology", "asdf", 544, 556.44F, "Makontso");


        library.display();

    }

}
