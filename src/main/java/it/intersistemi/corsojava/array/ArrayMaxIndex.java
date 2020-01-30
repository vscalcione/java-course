package it.intersistemi.corsojava.array;

import java.util.Random;

public class ArrayMaxIndex {
	public static void main(String[] args) {
		int result = searchMaxIndex();
		System.out.println("**********************");
		System.out.println("Max element of the array is located in position:  [" + result + "]");
	}

	public static int searchMaxIndex() {
		Random value = new Random();
		int[] array = new int[10];
		System.out.println("Generated Array: ");
		for (int index = 0; index < array.length; index++) {
			array[index] = value.nextInt(100);
			System.out.println("Position "+ index + " " + array[index]);
		}
		int max, maxIndex;
		maxIndex = array[0];
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}