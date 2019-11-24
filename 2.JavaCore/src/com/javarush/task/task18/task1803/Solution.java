package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int sim = fileInputStream.read();
            if (map.containsKey(sim)) {
                map.put(sim, map.get(sim) + 1);
            } else map.put(sim, 1);
        }

        reader.close();
        fileInputStream.close();

        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue().equals(max))

                System.out.print(pair.getKey() + " ");
        }
    }
}
