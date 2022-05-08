//Question 8

package com.packages;

public class Books_
{
    String author, title, publisher;
    int stockPosition;
    double cost;

    Books_()
    {
        author = "";
        title = "";
        publisher = "";
        stockPosition = 0;
        cost = 0.0;
    }

    Books_(String author, String title, String publisher, int stockPosition, double cost)
    {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.stockPosition = stockPosition;
        this.cost = cost;
    }

    public void displayDetails()
    {
        System.out.println("Title: " + title + "\n"
                            + "Author: " + author + "\n"
                            + "Publisher: " +publisher + "\n"
                            + "Stock Position" + stockPosition + "\n"
                            + "Cost: R"+ cost);
    }


}
