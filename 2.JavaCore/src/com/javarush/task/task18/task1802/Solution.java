package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите путь до файла: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream file = new FileInputStream(name);

        int i=0;
        byte min=127;
        while ((i=file.read()) != -1){
//            int i=file.read();
            if(i<=min)
                min = (byte)i;
        }

        file.close();
        reader.close();
        System.out.println(min);
    }
}
