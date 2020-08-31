package com.company;

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        int number, reverse = 0;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while(number != 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        System.out.println(reverse);
    }

}


