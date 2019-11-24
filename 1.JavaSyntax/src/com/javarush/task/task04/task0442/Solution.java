package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int number2 = 0;
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            number2 = number2 + number;
            if(number==-1){
                System.out.println(number2);
                break;
            }

        }
    }
}
