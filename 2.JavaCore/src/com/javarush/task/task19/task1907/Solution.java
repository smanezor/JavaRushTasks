package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            bufferedReader.close();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            int count = 0;
            String world = "world";
            while (fileReader.ready()){
                String stringLine = fileReader.readLine();
                String[] arrayStrings = stringLine.toString().split("\\W");
                for (String str : arrayStrings) {
                    if(str.equals(world))
                        count++;
                }
            }
            System.out.println(count);
            fileReader.close();

        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }
}
