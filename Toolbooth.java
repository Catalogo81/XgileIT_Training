//Question 9

package com.packages;

public class Toolbooth
{
    int carTotal;
    double cashTotal;

    public Toolbooth()
    {
        carTotal = 0;
        cashTotal = 0;
    }

    public void payingCar()
    {
        carTotal += 1;
        cashTotal += 1;
    }

    public void nonPayingCar()
    {
        carTotal += 1;
    }

    public void displayDetails()
    {
        System.out.println(" The total number of cars passed by without paying is : " + carTotal +
                "\n" + "Total number of cars passed by: "+ carTotal + "\n" +
                "+ Total cash collected: " + cashTotal);
    }

    public static void main(String[] args)
    {
        Toolbooth toolbooth = new Toolbooth();

        toolbooth.payingCar();
        toolbooth.payingCar();
        toolbooth.nonPayingCar();

        toolbooth.displayDetails();
    }
}
