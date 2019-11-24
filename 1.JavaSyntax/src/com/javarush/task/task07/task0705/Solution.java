package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(reader.readLine());
        }
        int[] numLittle = new int[10];
        int[] numLittleTwo = new int[10];

        for(int i=0; i<10; i++){
            numLittle[i]=numbers[i];
            numLittleTwo[i]=numbers[10 + i];

            System.out.println(numLittleTwo[i]);
        }




    }
}
