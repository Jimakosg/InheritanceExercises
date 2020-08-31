package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double number = 1.6666;
        //The -1 exists because the system counts the "." as a digit but the exercise only asks for Digits
        long length = String.valueOf(number).length() - 1;

        System.out.println(number);
        System.out.println(length);
    }


}


