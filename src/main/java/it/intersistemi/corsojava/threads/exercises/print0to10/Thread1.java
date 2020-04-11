package it.intersistemi.corsojava.threads.exercises.print0to10;

public class Thread1 extends Thread{

    @Override
    public void run() {
        while(Print0To10.value != 10){
            while(Print0To10.flag != 1);
            Print0To10.value += 1;
            Print0To10.flag = 2;
        }
    }
}
