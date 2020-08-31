package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String string = "madam";
        char[] array = string.toCharArray();
        System.out.println(palidromeCheck(array));

        //System.out.println(isPalindrome("madam"));


    }

    public static boolean palidromeCheck(char[] string){
        int i = 0;
        int j = string.length - 1;

        while (i > j){
            if (string[i] != string[j]);
            return false;
        }
        i++;
        j++;
        return true;
    }

    //This is a second solution.
    public static boolean isPalindrome(String str){

        return str.equals(new StringBuffer().append(str).reverse().toString());

    }


}


