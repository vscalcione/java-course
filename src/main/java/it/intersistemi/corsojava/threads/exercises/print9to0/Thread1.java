package it.intersistemi.corsojava.threads.exercises.print9to0;

public class Thread1 extends Thread{

	@Override
	public void run(){
		while(PrintValues0to9And9to0.flag == 1);
		for(int i = 0; i <= 9; i++){
			PrintValues0to9And9to0.printer.print(i);
		}
		PrintValues0to9And9to0.flag = -1;
	}
}
