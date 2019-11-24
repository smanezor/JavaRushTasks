package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите путь до файла: ");
//        String a = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(a);
//        List<Integer> list = new ArrayList<>();
//
//        while (fileInputStream.available() > 0)
//            list.add(fileInputStream.read());
//
//        fileInputStream.close();
//        Comparable max = Collections.max(list);
//        System.out.println(max);

        System.out.println("Введите путь до файла: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(filename);

        int i = 0;
        int max = 0;
        while((i = fileInputStream.read()) != -1){
            if(i > max)
                max = i;
        }

        fileInputStream.close();

        System.out.println("Максимальный байт: " + max);
    }
}
