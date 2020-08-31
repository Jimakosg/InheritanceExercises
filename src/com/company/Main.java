package com.company;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            String password = "aaZZa44@";
            String regex = "(?i)(?:([a-z0-9])\\\\1{2,})*(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            System.out.println(password.matches(regex));

            String okPwd = "(?i)(?:([a-z0-9])\\\\1{2,})*(?=.*[0-9])";
            String strongPwd = "(?i)(?:([a-z0-9])\\\\1{2,})*.{8,}";
            String invalidPwd = ".{8,}";


            if(password.matches(okPwd)){
                System.out.println("Password Ok");
            }else if (password.matches(regex)){
                System.out.println("Very Strong Password");
            }else if (password.matches(strongPwd)){
                System.out.println("Strong Password");
            }else if (!password.matches(regex) || !password.matches(invalidPwd)){
                System.out.println("Invalid Password. Your password needs to be at least 8 letters long, " +
                        "to contain at least one uppercase letter, one lowercase letter, " +
                        "a digit and a special character");

            }
        }

}


