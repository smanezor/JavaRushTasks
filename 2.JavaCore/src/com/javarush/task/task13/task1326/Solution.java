package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(
                        "Mac SSD/Users/antonov/Desktop/" +reader.readLine())));

                while (fileReader.ready()){
                    int i = Integer.parseInt(fileReader.readLine());
                    if (i % 2 == 0)
                        list.add(i);
                }
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Collections.sort(list);
            for (Integer i : list){
                System.out.println(i);
            }
        }
}
