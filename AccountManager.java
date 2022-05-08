//Question 3

package com.packages;

import java.util.Arrays;

public class AccountManager
{
    //Bank account array that contains bank accounts
    BankAccount[] bankAccounts;
    int i;
    int accounts;

    BankAccount bankAccount1 = new BankAccount(5554446, 45457.54F, "Kgotso");
    BankAccount bankAccount2 = new BankAccount(5698765, 8654.23F, "John");
    BankAccount bankAccount3 = new BankAccount(2554896, 9846.65F, "Peter");
    BankAccount bankAccount4 = new BankAccount(8745698, 324324.34F, "Makontso");
    BankAccount bankAccount5 = new BankAccount(4563158, 435.43F, "Kenny");


    public AccountManager(int numberOfAccounts)
    {
        bankAccounts = new BankAccount[numberOfAccounts];
        i = 0;
        accounts = numberOfAccounts;

    }

    //to create an account
    public void createAccount(int accountNumber, float balance, String ownerName)
    {
        if(i <= accounts)
        bankAccounts[i++] = new BankAccount(accountNumber, balance, ownerName);
    }

    //to terminate an account
    public void deleteAccount(int account)
    {
        for(int i = 0; i < accounts; i++)
        {
            if(bankAccounts[i].accountNumber == account && bankAccounts[i] != null)
            {
                bankAccounts[i] = null;
            }
        }
    }

    //to deposit an amount into an account
    public void depositIntoAccount(int account, float amount)
    {
        for(int i = 0; i < accounts; i++)
        {
            if(bankAccounts[i].accountNumber == account && bankAccounts[i] != null)
            {
                bankAccounts[i].add(amount);
            }
        }
    }

    //to withdraw an amount from an account
    public void withdrawFromAccount(int account, float amount)
    {
        for(int i = 0; i < accounts; i++)
        {
            if(bankAccounts[i].accountNumber == account && bankAccounts[i] != null)
            {
                bankAccounts[i].subtract(amount);
            }
        }
    }

    //to display the account details
    public void displayAccountDetails(int account)
    {
        for(int i = 0; i < accounts; i++)
        {
            if(bankAccounts[i].accountNumber == account && bankAccounts[i] != null)
            {
                String accountNumber = String.valueOf(bankAccounts[i].accountNumber);
                String accountBalance = String.valueOf(bankAccounts[i].balance);
                String accountOwnerName = String.valueOf(bankAccounts[i].ownerName);

                System.out.println("Account Number: " + accountNumber + "\n"
                                    + "Balance: R" + accountBalance + "\n"
                                    + "Owner Name: " + accountOwnerName);
            }
        }
    }
}
