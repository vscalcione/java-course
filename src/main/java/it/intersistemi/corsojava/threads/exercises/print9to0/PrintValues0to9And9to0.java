package it.intersistemi.corsojava.threads.exercises.print9to0;

public class PrintValues0to9And9to0 {

	public static Printer printer = new Printer();
	public static volatile int flag = -1;

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
