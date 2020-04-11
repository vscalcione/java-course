package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

import java.util.LinkedList;
import java.util.Queue;

public class WarehouseLinkedListSync implements Warehouse {

	private Queue<String> products = new LinkedList<>();
	
	@Override
	public synchronized void produce(String product) {
		System.out.println("Warehouse.produce: " + product);
		this.products.add(product);
		try {
			wait();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public synchronized String consume() {
		if(products.isEmpty()) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String product = this.products.poll();
		System.out.println("Warehouse.consume: " + product);
		notify();
		return product;
	}
}
