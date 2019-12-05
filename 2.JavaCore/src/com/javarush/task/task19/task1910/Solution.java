package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();

            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

            while (reader.ready()){
                String str = reader.readLine();
                writer.write(str.replaceAll("[\\p{Punct}\\n]",""));
            }
            reader.close();
            writer.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
