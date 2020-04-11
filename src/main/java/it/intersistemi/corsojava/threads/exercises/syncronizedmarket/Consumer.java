package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

public class Consumer implements Runnable{

	private Warehouse warehouse;

    public Consumer(Warehouse market) {
        this.warehouse = market;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        String product = null;
        while((product = warehouse.consume()) != null){
            System.out.println("Consumer: " + product);
        }
    }

}
