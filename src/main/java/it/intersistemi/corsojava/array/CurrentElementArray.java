package it.intersistemi.corsojava.array;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CurrentElementArray {
	public static void main(String[] args) throws IOException, IllegalArgumentException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = ConsoleInputInt.readInt(console, "How much elements do you want your array to have? ");
		int[] array = new int[arrayLength];
		mostRecurrentElementArray(array);
	}
	
	public static void mostRecurrentElementArray(int array[]) {
		Random rndValue = new Random();
		int tmp = 0, tmp2 = 0, repeatedNumber = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rndValue.nextInt(10);
			System.out.print(" | "+array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] == array[j])
					tmp++;
			}
			int j = 1;
			if(tmp > tmp2) {
				tmp2 = tmp;
				repeatedNumber = array[i];
			}
			tmp = 0;
		}
		System.out.println("\n Ripeated value: "+repeatedNumber+" for " + tmp2 + " times");
	}
}