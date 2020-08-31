package com.company;

import java.util.Stack;

class Main {
        public static void main(String[] args) {
            // write your code here

            int number = 8; //the factorial number that we want to calculate, example: 8

            int result = calculate(number);
            System.out.println("The factorial of " + number + " is: " + result);

        }

        public static int calculate(int number) {

            if (number >= 1) {

                return number * calculate(number - 1);

            } else return 1;

        }

    }
