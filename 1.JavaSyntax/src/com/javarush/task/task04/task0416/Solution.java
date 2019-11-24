package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        int b = (int) t;
        int remain = b % 5;

        if (remain==3) System.out.println("желтый");

        if (remain==4) System.out.println("красный");

        System.out.println("зелёный");



    }
}