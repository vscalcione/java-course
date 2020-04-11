package it.intersistemi.corsojava.threads.exercises.print9to0;

public class Printer {

	public void print(int value){
		System.out.print(value + " ");
		try{
			Thread.sleep(50);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
