package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int numberTwo = Integer.parseInt(reader.readLine());
        int numberThree = Integer.parseInt(reader.readLine());
        if(number == numberTwo && number!=numberThree)
            System.out.println("3");
        else if(numberTwo==numberThree && numberTwo!=number)
            System.out.println("1");
        else if(number == numberThree && number!=numberTwo)
            System.out.println("2");

    }
}
