package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while(!currentThread().isInterrupted()){
                try {
                    if(numSeconds>=1) {
                        Thread.sleep(1000);
                        System.out.println("3 2 1 Марш!");
                        break;
                    }
                } catch (InterruptedException e) {
                    System.out.println("4 3 2 1 Прервано!");
                }

            }
        }
    }
}
