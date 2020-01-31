package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegativeSum {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
		int inputValue;
		int positiveSum = 0;
		int negativeSum = 0;
		do {
			inputValue = ConsoleInputInt.readInt(console, "Insert positive or negative value: ");
			if(inputValue > 0)
				positiveSum += inputValue;
			else {
				if(inputValue < 0)
					negativeSum += inputValue;
			}
		}
		while(inputValue != 0);
		System.out.println("Positive sum: " + positiveSum);
		System.out.println("Negative sum: " + negativeSum);
	}
}