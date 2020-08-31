package com.company;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        pushStack(stack);


        peekStack(stack);

        popStack(stack);

    }

    public static void peekStack(Stack<Integer> stack){

        int element = (int) stack.peek();
        System.out.println(element);
    }

    public static void pushStack(Stack<Integer> stack){

        for (int i = 0; i < 15; i++){
            int j = stack.push(i);

        }

    }

    public static void popStack(Stack<Integer> stack){

        for (int i = 0; i < 15; i++){
            int j = stack.pop();
            System.out.println(j);
        }

    }


}


