package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();

            BufferedReader fileReader = new BufferedReader(new FileReader(file1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

            int i = 0;
            while (fileReader.ready()){
                String line = fileReader.readLine();
                String[] arrStr = line.toString().split("\\s");
                for (String s : arrStr) {
                    try {
                        System.out.println(Integer.parseInt(s));
                        bufferedWriter.write(s.concat(" "));
                    } catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                    }
                }
                i++;
            }

            fileReader.close();
            bufferedWriter.close();
        } catch (IOException error){
            System.out.println(error.getMessage());
        }
    }
}
