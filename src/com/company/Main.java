package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        Set set = new HashSet();

        for (int i = 0; i < x; i++){
            //The set check whether there are duplicate values and removes them automatically.
            //The set.add(5); is removed since the number 5 already exists in the list.
            set.add(i);
            set.add(5);

        }
        System.out.println(set);
    }





}


