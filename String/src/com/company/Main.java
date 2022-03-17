package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string 1 :");
        String str1 = sc.nextLine();
        System.out.print("Enter a string 2 :");
        String str2 = sc.nextLine();
        System.out.println("Enter the Suffled string : ");
        String str3 = sc.nextLine();
        //System.out.print(str3);
        int j =0;
        int present = 0;
        for(int i = 0 ; i < str1.length() ; i++){
            present = 0;
            while(j!=str3.length()){
                if(str1.charAt(i) == str3.charAt(j)) {
                    str3 = str3.substring(0, j) + '2' + str3.substring(j + 1);
                    present = 1;
                    break;
                }
                //System.out.println(j+"str3  " + str3.length());
                if(present == 0 && j == str3.length()-1){
                    //System.out.print(str3);
                    System.out.println("Invalid shuffle");
                    return;
                }
                j++;
            }
        }
        j=0;
        for(int i = 0 ; i < str2.length() ; i++){
            present = 0;
            while(j!=str3.length()){
                if(str2.charAt(i) == str3.charAt(j)) {
                    str3 = str3.substring(0, j) + '2' + str3.substring(j + 1);
                    j++;
                    present = 1;
                    break;
                }
                if(present == 0 && j==str3.length()-1){
                    System.out.println("Invalid shuffle");
                    return;
                }
                j++;
            }
        }
        //System.out.println(str3);
        System.out.print("Valid Shuffle");
    }
}
