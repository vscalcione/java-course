package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintValueMultiples {
	public static void main(String[] args) throws IOException, IllegalArgumentException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Insert value whose multiples you want to calculate: ");
		int tmp = 0;
		int rangeValues = ConsoleInputInt.readInt(console, "Insert search limit of multiples of " + value + " : ");
		for (int i = value; i <= rangeValues ; i+=value) {
			tmp++;
			System.out.println("Multiple " + tmp + " : " + i);
		}
		System.out.println("They had been found  " + tmp + " multiples of " + value + " up to the value: " + rangeValues);
	}
}
