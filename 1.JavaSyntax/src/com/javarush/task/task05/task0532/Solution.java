package com.javarush.task.task05.task0532;

import sun.font.DelegatingShape;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        if(a>=1 && b>=1 && c>=1)
//            System.out.println(Math.max(Math.max(a,b),c));
//        else
//            System.out.println("какое то число равно 0");

        int maximum;

        int N = Integer.parseInt(reader.readLine());
        if (N<=0) return;

        int a;
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<N-1;i++) {
            a = Integer.parseInt(reader.readLine());
            if (a>maximum) {
                maximum = a;
            }
        }

        System.out.println(maximum);
    }
}
