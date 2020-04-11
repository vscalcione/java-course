package it.intersistemi.corsojava.threads.exercises.print20values;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		while(!Print20ValuesPairDispair.flag);
		Print20ValuesPairDispair.flag = false;
		for (int i = 0; i < 20; i++) {
			if(i % 2 != 0) {
				System.out.print(i+" - ");
			}
		}
		Print20ValuesPairDispair.flag = true;
	}
}
