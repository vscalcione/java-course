package it.intersistemi.corsojava.array;


import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraySorted {
	public static void main(String[] args) throws IOException {
		Random value = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = ConsoleInputInt.readInt(console, "How much elements do you want your array to have? ");
		int[] array = new int[arrayLength];
		System.out.println("Original Array ");
		for (int index = 0; index < array.length; index++) {
			array[index] = value.nextInt(10)+1;
			System.out.print(" | " + array[index]);
		}
		System.out.println("");
		boolean check = isCrescente(array);
		if(check == true) {
			System.out.println("Array ordered in ascending order ");
		}
		else {
			System.out.println("Array not sorted or not in ascending order ");
		}
	}
	
	public static boolean isCrescente(int array[]) {
		for (int index = 1; index < array.length - 1; index++) {
			if(array[index] >= array[index + 1]) {
				return false;
			}
		}
		return true;
	}
}