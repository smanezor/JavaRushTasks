package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = new String(reader.readLine());
        int vozr = Integer.parseInt(reader.readLine());
        if (vozr < 18) {
            System.out.println("Подрасти еще");
        }

    }
}
