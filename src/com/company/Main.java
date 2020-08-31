package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 3;

        System.out.println(calculate(number));


    }

    static double calculate(int number)
    {
        double sum = 0;
        int factorial = 1;

        for (int i = 1; i <= number; i++)
        {

            factorial *= i;

            sum += 1.0/factorial;
        }
        return sum;
    }

}


