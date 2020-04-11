package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

public class WarehouseSync implements Warehouse {

	private String product;
	private boolean empty = true;

	public synchronized void produce(String product) {
		if(!empty) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.product = product;
		this.empty = false;
		notify();
	}
	public synchronized String consume() {
		if(empty) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		String product = this.product;
		this.product = null;
		this.empty = true;
		notify();
		return product;
	}
}
