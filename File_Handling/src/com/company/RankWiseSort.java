package com.company;

public class RankWiseSort {

    public RankWiseSort(String[][] Column, int n, int val){
        String name;String cla10;String cla12;String btech;String rank;
        for (int i = 0; i < n ; i++) {
            for(int j = 1 ; j < n-i-1; j++){
                if(Integer.parseInt(Column[j][4]) > Integer.parseInt(Column[j+1][4])){
                    name = Column[j][0];
                    cla10 = Column[j][1];
                    cla12 = Column[j][2];
                    btech = Column[j][3];
                    rank = Column[j][4];

                    Column[j][0] = Column[j+1][0];
                    Column[j][1] = Column[j+1][1];
                    Column[j][2] = Column[j+1][2];
                    Column[j][3] = Column[j+1][3];
                    Column[j][4] = Column[j+1][4];

                    Column[j+1][0] = name;
                    Column[j+1][1] = cla10;
                    Column[j+1][2] = cla12;
                    Column[j+1][3] = btech;
                    Column[j+1][4] = rank;

                }
            }
        }


    }
}
