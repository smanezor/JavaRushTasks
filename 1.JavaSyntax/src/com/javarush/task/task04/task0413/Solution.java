package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sD = reader.readLine();
        int nD = Integer.parseInt(sD);

        if(nD==1){
            System.out.println("понедельник");
        }
        if(nD==2){
            System.out.println("вторник");
        }
        if(nD==3){
            System.out.println("среда");
        }
        if(nD==4){
            System.out.println("четверг");
        }
        if(nD==5){
            System.out.println("пятница");
        }
        if(nD==6){
            System.out.println("суббота");
        }
        if(nD==7){
            System.out.println("воскресенье");
        }
        if(nD<=0){
            System.out.println("такого дня недели не существует");
        }
        if(nD>=8){
            System.out.println("такого дня недели не существует");
        }
    }
}