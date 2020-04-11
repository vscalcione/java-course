package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

public class WarehouseSimple implements Warehouse {

	private String product;
	private boolean empty = true;
	
	@Override
	public synchronized void produce(String product) {
		this.product = product;
		this.empty = empty;
	}
	
	@Override
	public synchronized String consume() {
		String product = this.product;
		this.product = null;
		this.empty = true;
		return product;		
	}
}
