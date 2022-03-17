package com.company;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> mylist = new ArrayList<String>();
        //mylist ={"hasedin"};  not allowed

        mylist.add("hashed-in");
        mylist.add(" by");
        mylist.add(" deloitte");
        mylist.add(" 2022");
        System.out.println("Original list : "+ mylist);
        Collections.reverse(mylist);

        System.out.println("Reversed list : "+mylist);


    }
}


