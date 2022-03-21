package com.company;

import java.util.*;

public class Main {
    public static void isValid(String password)
            throws InvalidPasswordException {
            if(!((password.length()) >= 5) && (password.length()<=10)){
                throw new InvalidPasswordException(1);
            }
            if(true){
                int count = 0;
                for(int i = 0 ; i<=9;i++){
                    String str1 = Integer.toString(i);
                    if(password.contains(str1)){
                        count = 1;
                    }
                }
                if(count == 0){
                    throw new InvalidPasswordException(2);
                }
            }
            if(!(password.contains("@") || password.contains("#") || !password.contains("&") || password.contains("%") || !password.contains("*") || password.contains("!"))){
                throw new InvalidPasswordException(3);
            }
            if(true){
                int count =0;
                for(int i = 65; i<=90 ; i++){
                    char c = (char)i;
                    String str1 = Character.toString(c);
                    if(password.contains(str1)){
                        count = 1;
                    }
                }
                if(count == 0){
                    throw new InvalidPasswordException(4);
                }
            }
            if(true){
                int count =0;
                for(int i = 90; i<=122 ; i++){
                    char c = (char)i;
                    String str1 = Character.toString(c);
                    if(password.contains(str1)){
                        count = 1;
                    }
                }
                if(count == 0){
                    throw new InvalidPasswordException(5);
                }
            }
        }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password");
        String password = sc.nextLine();

        try{
            isValid(password);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e){
            System.out.print("Invalid Password");
        }

    }
}
