package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows = sc.nextInt();
        int sp = rows-1;
        int star = 0;
        rows = rows*2;

        for(int i = 1 ; i < rows ; i++){
            //System.out.print(sp+ " " + star);
            for(int j = 0 ; j <= sp ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= star ; j++){
                System.out.print("*");
            }
            if(i < rows/2){
                sp--;
                star++;
            }
            else{
                star--;
                sp++;
            }
            System.out.println("");


        }

    }
}
