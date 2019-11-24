package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int f = Integer.parseInt(s);
        if (f > 0)
            System.out.println(f * 2);
        else if (f < 0)
            System.out.println(f + 1);
        else if (f == 0)
            System.out.println(f = 0);

    }

}