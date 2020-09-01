package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

            Account account = new Account("Jimakos", 650.00, 36);

            System.out.println("Your balance is: " + account.balance);
            account.withdraw(50.00);
            System.out.println(account.balance);
            account.deposit(50.00);
            account.deposit(50.00);
            System.out.println(account.balance);


    }
}


