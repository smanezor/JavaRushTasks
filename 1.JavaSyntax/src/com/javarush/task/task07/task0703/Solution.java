package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i<strings.length; i++){
            strings[i]=reader.readLine();
        }
        for (int j=0;j<numbers.length; j++){
            numbers[j]=strings[j].length();
            System.out.println(numbers[j]);
        }


    }
}
