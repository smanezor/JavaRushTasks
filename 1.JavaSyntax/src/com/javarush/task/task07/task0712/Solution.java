package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minStr = list.get(0).length();
        int maxStr = minStr;
        for (String s : list){
            if (s.length() > maxStr)
                maxStr = s.length();
            if (s.length() < minStr)
                minStr = s.length();
        }
        for (String s : list)
            if (s.length() == maxStr || s.length() == minStr){
                System.out.println(s);
                break;
            }
    }
}
