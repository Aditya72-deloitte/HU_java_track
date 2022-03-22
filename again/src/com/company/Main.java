package com.company;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws IOException{
        //write your code here
        Scanner scn = new Scanner(System.in);

        System.out.println("Existing user??");
        System.out.println("Yes/no");
        System.out.println("press 1 for registration and press 2 for login");

        int whichoption = scn.nextInt();

        if(whichoption == 2){
            Login log = new Login();
            String username = scn.next();
            String password = scn.next();
            log.Log(username,password);
        }
        else{
            System.out.println("Enter valid choice");
        }


    }
}