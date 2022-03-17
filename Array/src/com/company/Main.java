package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in Array :");
        int n = sc.nextInt();
        System.out.print("Enter the elements of an Array :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int positive = 1, negative = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>0) {
                arr[i] = 1;
            }
            else{
                arr[i] = -1;
            }
            if(i>0){
                arr[i] += arr[i-1];
            }
            if(arr[i] == 1){
                positive++;
            }
            else negative++;
        }
        System.out.println("o/p = "+ (positive+negative));





    }
}
