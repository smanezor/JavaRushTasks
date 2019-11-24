package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        if (n1 <= n2 && n2 <= n3) System.out.print("\n" + n3 + " " + n2 + " " + n1);
        else if (n1 <= n3 && n3 <= n2) System.out.print("\n" + n2 + " " + n3 + " " + n1);
        else if (n2 <= n1 && n1 <= n3) System.out.print("\n" + n3 + " " + n1 + " " + n2);
        else if (n2 <= n3 && n3 <= n1) System.out.print("\n" + n1 + " " + n3 + " " + n2);
        else if (n3 <= n1 && n1 <= n2) System.out.print("\n" + n2 + " " + n1 + " " + n3);
        else if (n3 <= n2 && n2 <= n1)System.out.print("\n" + n1 + " " + n2 + " " + n3);
    }
}
