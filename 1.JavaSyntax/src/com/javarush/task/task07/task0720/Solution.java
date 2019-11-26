package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

//        System.out.print("Введите N чисел: ");
        int N = Integer.parseInt(reader.readLine());
//        System.out.print("Введите M чисел: ");
        int M = Integer.parseInt(reader.readLine());

//        System.out.println("Введите текст:");
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            list.add(list.get(i));
        }

        for (int i = M-1; i>=0 ; i--) {
            list.remove(i);
        }

        for (String str : list) {
            System.out.println(str);
        }
    }
}
