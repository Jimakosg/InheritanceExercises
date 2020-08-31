package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverse("Kalhmera Kalhspera"));

    }

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack stack = new Stack();

        for(int i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(int i = 0; i < size; ++i) {
            charArr[i] = (char) stack.pop();
        }

        return String.valueOf(charArr);
    }

}


