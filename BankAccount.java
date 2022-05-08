//Question 3

package com.packages;

public class BankAccount
{
    int accountNumber;
    float balance;
    String ownerName;

    public BankAccount(int accountNumber, float balance, String ownerName)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    //to check remaining balance
    public float balance()
    {

        return balance;
    }

    //to deposit an amount
    public double add(float amount)
    {
        //adding the amount to the balance
        balance = balance + amount;

        return balance;
    }

    //to withdraw an amount
    public double subtract(float amount)
    {
        if(amount <= balance)
            balance = balance - amount;

        return balance;
    }
}
