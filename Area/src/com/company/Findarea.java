package com.company;

public class Findarea {
        void area(int side){
            System.out.println("The area of Square is " + side*side);
        }
        void area(int side_1 , int side_2){
            System.out.println("The area of Rectangle is" + side_1*side_2);
        }
        void area(float radius){
            System.out.println("The area of circle is" + 3.14*radius*radius);
        }
        void area(int a,int b, int c){
            float s = (a+b+c)/2;
            System.out.print("Area of the triangle is "+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }

}
