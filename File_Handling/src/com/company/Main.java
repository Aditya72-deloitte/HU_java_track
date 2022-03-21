package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\adityakumar72\\Desktop\\Student.csv");
        String line = "";
        String [][] Column = new String[60][];
        int i = 0;
        int topRanks = 5;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null) {

                Column[i] = line.split(",");
                //if(i>0)
                //System.out.println(i+ " Name: "+Column[i][0]+ " Reg no-10 "+Column[i][1]+" Reg no-12 "+Column[i][2]+" Reg no-B.tech "+Column[i][3]+" Rank: " +Column[i][4]);
                i++;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        new RankWiseSort(Column,i,5);


        System.out.println("Top 5 rankers are: ");
        FileWriter fw = new FileWriter("output.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for (int j = 0; j < topRanks+1; j++) {
            pw.println(Column[j][0]+","+Column[j][1]+","+Column[j][2]+","+Column[j][3]+","+Column[j][4]);
            System.out.println("Name "+Column[j][0]+" Reg no-10 : "+Column[j][1]+" Reg no-12 "+Column[j][2]+" Reg no-Btech : "+Column[j][3]+" Rank "+Column[j][4]);
            pw.flush();
        }
        pw.close();

    }
}