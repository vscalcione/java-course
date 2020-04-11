package it.intersistemi.corsojava.threads.exercises.print9to0;

public class Thread2 extends Thread{

	@Override
	public void run(){
		while(PrintValues0to9And9to0.flag == 1);
		for(int i = 8; i >= 0; i = i - 1){
			PrintValues0to9And9to0.printer.print(i);
		}
		PrintValues0to9And9to0.flag = -1;
	}
}
