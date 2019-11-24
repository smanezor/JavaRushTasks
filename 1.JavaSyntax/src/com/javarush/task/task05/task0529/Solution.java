package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        while (true){
            String s = reader.readLine();


            if(s.equals("сумма")){

                System.out.println(a);
                break;
            }

            int sN = Integer.parseInt(s);
            a=a+sN;
        }
    }
}
