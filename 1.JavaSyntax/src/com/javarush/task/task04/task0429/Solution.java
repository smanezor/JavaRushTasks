package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int plus = 0;
        int minus = 0;

        if(a>0)
            plus++;
        if(b>0)
            plus++;
        if(c>0)
            plus++;
        if(a<0)
            minus++;
        if(b<0)
            minus++;
        if(c<0)
            minus++;
        if(minus>0)
            System.out.println("количество отрицательных чисел: " + minus);
        else
            System.out.println("количество отрицательных чисел: 0");
        if(plus>0)
            System.out.println("количество положительных чисел: " + plus);
        else
            System.out.println("количество положительных чисел: 0");
    }
}
