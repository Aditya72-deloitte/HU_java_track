package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            int num = 121/0;
            System.out.print(num);
        }
        catch(ArithmeticException e){
            System.out.println("Caught an Exception");
        }
        finally {
            System.out.println("Thank-you");
        }
    }
}
