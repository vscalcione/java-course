package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin3Values {

	public static void main(String[] args) throws IOException{
		int firstValue, secondValue, thirdValue;
		int maxBetweenAandB, minBetweenAandB;
		int max, min;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		firstValue = ConsoleInputInt.readInt(console, "Insert value: ");
		secondValue = ConsoleInputInt.readInt(console, "Insert value: ");
		thirdValue = ConsoleInputInt.readInt(console, "Insert value: ");
		if(firstValue > secondValue) {
			maxBetweenAandB = firstValue;
		}else {
			maxBetweenAandB = secondValue;
		}
		if(maxBetweenAandB > thirdValue) {
			max = maxBetweenAandB;
		}else {
			max = thirdValue;
		}
		
		if(firstValue < secondValue) {
			minBetweenAandB = firstValue;
		}else {
			minBetweenAandB = secondValue;
		}if(minBetweenAandB < thirdValue) {
			min = minBetweenAandB;
		}else {
			min = thirdValue;
		}
		System.out.println("Min value: " + min + " and Min value:: "+max);
	}
}