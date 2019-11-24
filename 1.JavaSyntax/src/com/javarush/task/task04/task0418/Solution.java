package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        System.out.println(solution.min(a,b));

    }

    public int min(int a, int b){
        if (a>b)
            return b;
        else
            return a;
    }

}