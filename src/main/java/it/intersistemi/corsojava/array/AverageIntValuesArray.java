package it.intersistemi.corsojava.array;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AverageIntValuesArray {
	public static void main(String[] args) throws IOException {
		Random value = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = ConsoleInputInt.readInt(console, "How much elements do you want your array to have? ");
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = value.nextInt(10);
			System.out.print(" | " + array[i]);
		}
		float result = averageArray(array);
		System.out.println("Average of your element's array " + result);
	}
	
	public static float averageArray(int array[]) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		float average = (float) sum / (array.length);
		return average;
	}
}