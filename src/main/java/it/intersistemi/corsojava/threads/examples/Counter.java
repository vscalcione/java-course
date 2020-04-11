package it.intersistemi.corsojava.threads.examples;

public class Counter {

    private int counter = 0;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment(int counter){
        counter++;
    }

    public void decrement(int counter){
        counter--;
    }
}
