package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chet=0;
        int neChet=0;
        for(int i=0; i<numbers.length; i++){
            numbers[i]=Integer.parseInt(reader.readLine());
            if(i%2==0)
                chet+=numbers[i];
            if(i%2!=0)
                neChet+=numbers[i];
        }

        if(chet>neChet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
