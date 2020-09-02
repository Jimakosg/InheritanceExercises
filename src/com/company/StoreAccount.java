package com.company;

public class StoreAccount extends Account {

    String name;
    String accountCategory;

    public StoreAccount(String owner, Double balance, int numberOfTransactions, String name, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.name = name;
        this.accountCategory = accountCategory;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void changeCategory(String accountCategory) {

        if(accountCategory.contains("Basic") ||  accountCategory.contains("Premium") || accountCategory.contains("Extra") || accountCategory.contains("Mid")) {
            this.accountCategory = accountCategory;
        }
        else System.out.println("Invalid Category");


    }
}



