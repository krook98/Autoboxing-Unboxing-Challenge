package com.sokalski;

import java.util.ArrayList;

// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String newCustomer, double initialAmount) {
        if(findCustomer(newCustomer) == null) {
            this.customers.add(new Customer(newCustomer, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);

        if(customer != null) {
            customer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }


}
