package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Integer arr[] = new Integer[20];
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int minimum /*= Collections.min(Arrays.asList(arr))*/;
        int maximum /*= Collections.max(Arrays.asList(arr))*/;

        maximum = arr[0];
        minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
            if (arr[i] < minimum)
                minimum = arr[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
