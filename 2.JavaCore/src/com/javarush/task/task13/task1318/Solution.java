package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        //String s = reader.readLine();
//        File file = new File("d:/file.txt");
//        BufferedReader reader1 = new BufferedReader(new FileReader(file));
//        String name;
//        String line;
//        System.out.println("Print file " + file.getName() + " y/n?");
//        name = reader.readLine();
//        if(name.equals("y"))
//            while ((line = reader1.readLine()) != null )
//                System.out.println(line);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //путь до файла d:\file.txt
        InputStream ireader = new FileInputStream(reader.readLine()); // читаем файл
        while (ireader.available()>0)
            System.out.print((char) ireader.read()); // без char выведет байты

        ireader.close();
        reader.close();



    }
}