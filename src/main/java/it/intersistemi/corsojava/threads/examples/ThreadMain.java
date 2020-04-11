package it.intersistemi.corsojava.threads.examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadMain {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException" + e.getMessage());
            }
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String currentDate = sdf.format(new Date());
			System.out.println(currentDate + " Thread n 1: " + Thread.currentThread());
        });

        Thread t2 = new Thread(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String currentDate = sdf.format(new Date());
            System.out.println(currentDate + " Thread n 2: " + Thread.currentThread());
        });
		try {
			t1.sleep(1000);
		}
		catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//		t2.start();
//        t1.start();
//        t2.start();
//        t1.interrupt();
}
