package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

public class Manufactorer implements Runnable{

	private Warehouse warehouse;

	public Manufactorer(Warehouse warehouse) {
		this.warehouse = warehouse;
		new Thread(this, "Manufactorer: ").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			String product = " Product " + i;
			warehouse.produce(product);
			System.out.println("Manufactorer: "+product);
		}
	}
}
