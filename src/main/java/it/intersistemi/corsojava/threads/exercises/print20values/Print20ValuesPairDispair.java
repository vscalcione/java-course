package it.intersistemi.corsojava.threads.exercises.print20values;

public class Print20ValuesPairDispair {

	public static volatile boolean flag = true;

	public static void main(String[] args) {
		Thread1 pairThread = new Thread1();
		Thread2 dispairThread = new Thread2();
		System.out.println("*********** Print pair values ***********");
		pairThread.run();
		System.out.println("*********** Print dispair values ***********");
		dispairThread.run();
	}
}
