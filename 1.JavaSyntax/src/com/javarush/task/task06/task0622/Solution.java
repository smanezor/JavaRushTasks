package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }

        Collections.sort(list);
        String s = list.stream().map(Object::toString)
                .collect(Collectors.joining("\n"));
        System.out.println(s);
    }
}
