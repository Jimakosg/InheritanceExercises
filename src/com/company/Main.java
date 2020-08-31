package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 17; //17 is a prime number.
        boolean flag = false;

        for (int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("The number " + number + " is a prime");

        }else System.out.println("The number " + number + " is not a prime");

    }
}


