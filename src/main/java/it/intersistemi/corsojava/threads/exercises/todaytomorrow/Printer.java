package it.intersistemi.corsojava.threads.exercises.todaytomorrow;

public class Printer {

    public void print(char character){
        System.out.print(character);
        try{
            Thread.sleep(50);
        }catch(InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
