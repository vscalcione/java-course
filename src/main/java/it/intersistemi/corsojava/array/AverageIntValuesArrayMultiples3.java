package it.intersistemi.corsojava.array;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AverageIntValuesArrayMultiples3 {
	public static void main(String[] args) throws IOException{
		Random rndValue = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = ConsoleInputInt.readInt(console, "How much elements do you want your array to have? ");
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = rndValue.nextInt(10);
			System.out.print(" | "+array[i]);
		}
		float result = averageArray(array);
		System.out.println("Average of only elements divisible for 3 in your array: "+result);
	}
	
	public static float averageArray(int array[]) {
		int sum = 0, count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				count++;
				sum += array[i];
			}
		}
		float average = (float)sum / (count);
		return average;
	}
}