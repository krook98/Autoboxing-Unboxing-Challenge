package com.sokalski;

public class Main {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions
    public static void main(String[] args) {
        Bank bank = new Bank("PKO BP");
        bank.addBranch("Warszawa");

        bank.addCustomerToBranch("Warszawa", "Jakub", 21.37);
        bank.addCustomerToBranch("Warszawa", "Marek", 12.37);

        bank.addBranch("Kraków");
        bank.addCustomerToBranch("Kraków", "Jan", 1.01);
        bank.addCustomerToBranch("Kraków", "Maciej", 12.01);


        bank.addCustomerTransaction("Warszawa", "Marek", 12.44);
        bank.addCustomerTransaction("Kraków", "Jan", 20.08);
        bank.addCustomerTransaction("Kraków", "Maciej", 22.21);


        bank.listCustomers("Warszawa", false);
        bank.listCustomers("Kraków", true);




    }
}
