package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    static void isanagram(char[] str1, char[] str2){
        for(int i = 0 ; i < str1.length ; i++){
            if(str1[i] != str2[i]){
                System.out.println("Given Strings are not Anagram");
                break;
            }
            if(i==str1.length-1){
                System.out.println("Given Strings are Anagram");
            }
        }
        return;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc  = new Scanner(System.in);
        char str1[] = {'k','e','e','p'};
        char str2[] = {'p','e','e','k'};


        //to convert string into character array


        Arrays.sort(str1);
        Arrays.sort(str2);
        isanagram(str1,str2);
    }
}
