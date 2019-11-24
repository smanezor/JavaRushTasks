package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);

        if (a==b && b==c && c==a)
            System.out.println(a);

        else if (max == a && min == b)
            System.out.println(c);

        else if (max == b && min == a)
            System.out.println(c);

        else if (max == c && min == a)
            System.out.println(b);

        else if (max == a && min == c)
            System.out.println(b);

        else if (max == c && min == b)
            System.out.println(a);

        else if (max == b && min == c)
            System.out.println(a);


    }
}
