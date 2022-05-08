//Question 3

package com.packages;

public class Bank
{
    public static void main(String[] args)
    {
        //creates the accountManager object
        AccountManager accountManager = new AccountManager(5);

        //this will create the amount of accounts you want to create
        accountManager.createAccount(5557,3168,"Stan");
        accountManager.createAccount(1656, 5589,"Seven");
        accountManager.createAccount(8645, 5619999,"Hendry");
        accountManager.createAccount(4984,1848,"Ten");
        accountManager.createAccount(1856,616145,"Ruel");

        //displays the account details using the displayAccountDetails method
        accountManager.displayAccountDetails(5557);
        System.out.println("--------------------");
        accountManager.displayAccountDetails(1656);
        System.out.println("--------------------");
        accountManager.displayAccountDetails(8645);
        System.out.println("--------------------");
        accountManager.displayAccountDetails(4984);
        System.out.println("--------------------");
        accountManager.displayAccountDetails(1856);
        System.out.println("--------------------");

        //depositing money to an account
        accountManager.depositIntoAccount(5557, 100);
        accountManager.displayAccountDetails(5557);
        System.out.println("Deposited R100");
        System.out.println("--------------------");


        //withdraw an amount
        accountManager.withdrawFromAccount(5557, 100);
        accountManager.displayAccountDetails(5557);
        System.out.println("Withdrew R100");
        System.out.println("--------------------");

        //deleting an account
        accountManager.deleteAccount(5557);
        System.out.println("Account 5557 Deleted!");
        System.out.println("--------------------");
    }
}
