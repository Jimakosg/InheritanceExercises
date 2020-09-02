package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Jimakos", 650.00, 36);

        System.out.println("Your balance is: " + account.balance);
        account.withdraw(50.00);

        System.out.println("Your remaining balance now is : " + account.balance);
        account.deposit(50.00);
        account.deposit(50.00);
        System.out.println("Your remaining balance now is : " + account.balance);


        System.out.println("========================================================");
        StoreAccount storeAccount = new StoreAccount("Dimitris", 1050.00, 50, "Dimitris", null);

        storeAccount.withdraw(120.00);
        System.out.println(storeAccount.balance);
        storeAccount.deposit(64.00);
        System.out.println(storeAccount.balance);

        //Prints Invalid Category.
        storeAccount.changeCategory("qwerty");

    }
}


