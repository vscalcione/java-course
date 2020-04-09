package it.intersistemi.corsojava.matrix;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintIntArray {
	static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException {
		int lengthArray = ConsoleInputInt.readInt(console, "Array length: ");
		int[] array = new int[lengthArray];
		populateArray(array);
		printArray(array);
	}

	public static void populateArray(int[] array) throws IOException{
		for(int index = 0; index < array.length; index++){
			array[index] = ConsoleInputInt.readInt(console, "Insert value: ");
		}
	}

	public static void printArray(int[] array) throws IOException{
		for(int index = 0; index < array.length; index++){
			System.out.println("Element at position [" + index + "] is: " + array[index]);
		}
	}
}
