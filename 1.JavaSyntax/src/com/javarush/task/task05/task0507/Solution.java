package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        int n=0;
        double sum = 0;
        while (i!=-1){
            i = Integer.parseInt(reader.readLine());
            sum+=i;
            n++;
        }
        System.out.println((sum+1) / (n-1));

    }
}

