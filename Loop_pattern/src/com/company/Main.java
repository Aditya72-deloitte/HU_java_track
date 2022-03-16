package com.company;

public class Main {

    public static void main(String[] args) {
        int space = 9;
        for(int i = 1 ; i < 20 ; i++){
            if(i<=10){
                for(int sp = 0; sp<space; sp++){
                    System.out.print(" ");
                }
                for(int st = 1; st <= i ; st++){
                    System.out.print("*");
                }
                System.out.println("");
                space--;
            }
            else{
                for(int sp =1 ; sp<=i-10; sp++){
                    System.out.print(" ");
                }
                for(int st = 20-i; st>0;st--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
