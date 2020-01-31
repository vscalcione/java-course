package it.intersistemi.corsojava.exercises;

public class InstanceCounter {
	public static int instancesCounter;
	public InstanceCounter() {
		System.out.println("Creating a new instance ");
		instancesCounter++;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new InstanceCounter();
		}
		System.out.println("Have been created "+ InstanceCounter.instancesCounter+" istances ");
	}
}
