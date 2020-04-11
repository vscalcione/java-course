package it.intersistemi.corsojava.threads.exercises.syncronizedmarket;

public class EconomySync {

	public static void main(String[] args) {
		Warehouse warehouse = new WarehouseLinkedListSync();
		new Manufactorer(warehouse);
		new Consumer(warehouse);
	}
}
