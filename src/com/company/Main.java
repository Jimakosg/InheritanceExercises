package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int x = 115;
        List<Integer> list = new ArrayList<Integer>();
        //Adding integers into the list.
        for (int i = 1; i <= x; i++) {
            list.add(i);
        }
        System.out.println(list);

        //Checking whether the number is prime. If it's not, remove the item from the list.
        //If the number is prime, then remove it from the list.
        //Eventually ALL non-prime numbers are removed and the new list is printed again.
        for (int i = 0; i < list.size() -1 ; i++){
            if (!isPrime(list.get(i))){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }

    //This boolean method checks whether the inserted integer in the list is a prime or not using the % sign.
//If it returns 0, then it isn't a prime, otherwise it is.
    public static boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
            }
        }
        return flag;
    }




}


