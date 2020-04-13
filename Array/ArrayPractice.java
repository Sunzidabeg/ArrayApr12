package com.nipa.test.Array;

public class ArrayPractice {

    public static void main(String args[]) {
        int ID[] = {100, 101, 102, 103, 104}; //using data type int

      /*  100 Papia
        101 Nazmul
        102 Khurshed
        103 Nipa
        104 Aaraf */

        String name[] = {"Papia", "Nazmul", "Khurshed", "Nipa", "Aaraf"};//using da

        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {


                System.out.println(ID[i] + " " + name[j]);

            }

        }
    }
}