package it.intersistemi.corsojava.threads.examples;

import java.util.Random;

public class ThreadJoin {

    public static void main(String[] args) {
        Random value = new Random();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                Thread current = Thread.currentThread();
                try {
                    int wait = value.nextInt(10)*1000 + 1000;
                    System.out.println(current.getName() + "  ends to: " + wait + " milliseconds");
                    Thread.sleep(wait);
                    System.out.println(current.getName() + " End ");
                }
                catch(InterruptedException e) {
                    System.out.println(current.getName() + " I'm died ");
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All threads are terminated");
    }
}
