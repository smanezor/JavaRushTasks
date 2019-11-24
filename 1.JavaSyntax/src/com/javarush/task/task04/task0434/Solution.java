package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while(i<11){
            if (i==1) {}
            else {System.out.print("\n");}
            j = 1;
            while (j < 11) {
                System.out.print(i*j + " ");
                j++;
            }
            i++;
        }
    }
}
