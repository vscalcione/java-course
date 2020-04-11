package it.intersistemi.corsojava.threads.exercises.print0to10;

public class Thread2 extends Thread{

    @Override
    public void run() {
        while(Print0To10.value != 10){
            while(Print0To10.flag != 2);
            Printer.print(Print0To10.value);
            try{
                Thread.sleep(150);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            Print0To10.flag = 1;
        }
    }
}
