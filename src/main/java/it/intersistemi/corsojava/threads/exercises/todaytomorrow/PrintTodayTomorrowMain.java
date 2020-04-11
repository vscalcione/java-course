package it.intersistemi.corsojava.threads.exercises.todaytomorrow;

public class PrintTodayTomorrowMain {

    public static boolean flag = false;
    public static Printer printer = new Printer();

    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();
        thread1.start();
        thread2.start();
        thread1.setPriority(1);
        thread2.setPriority(2);
    }
}
