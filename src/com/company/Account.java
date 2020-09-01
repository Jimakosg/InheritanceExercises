package com.company;

public class Account {

    String owner;
    Double balance;
    int numberOfTransactions;

    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }

}
