package it.intersistemi.corsojava.array;

import java.util.Random;

public class ArrayContainsMain {
	public static void main(String[] args) throws InterruptedException{
		Random value = new Random();
		int arrayInt[] = new int[10];
		for (int index = 0; index < arrayInt.length; index++) {
			arrayInt[index] = value.nextInt(100);
			System.out.println(arrayInt[index] + (index < arrayInt.length - 1 ? ", " : ""));
		}
		while(true) {
			int tmp = value.nextInt(100);
			boolean booleanVariable = contains(tmp, arrayInt);
			if(booleanVariable) {
				System.out.println("Il valore e' presente: "+tmp);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean contains(int element, int[] arrayInt) {
		for (int index = 0; index < arrayInt.length; index++) {
			if(arrayInt[index] == element) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean contains(Object e, Object arrayInt[]) {
		for (int i = 0; i < arrayInt.length; i++) {
			if(arrayInt[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
}