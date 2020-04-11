package it.intersistemi.corsojava.threads.exercises.print0to10;

public class Print0To10 {

    public static volatile int value = -1;
    public static volatile int flag = 1;
    public static Printer printer = new Printer();

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
