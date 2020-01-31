package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbers {
	int value;
	public SumNumbers(int values) {
		value = values;
	}
	public int printSum() {
		if(value >= 0) {
			int tmp = 0, sum = 0;
			while (tmp <= value) {
				sum = sum + tmp;
				tmp = tmp + 1;
			}
			return sum;
		}
		return 0;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Insert value: ");
		SumNumbers numbersToAdd = new SumNumbers(value);
		int result = numbersToAdd.printSum();
		System.out.println("The sum of the numbers preceding to " + value + " is: " + result);
	}
}