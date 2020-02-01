package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws IOException, IllegalArgumentException{
		System.out.println("************ Factorial of a value ************ ");
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Insert value: ");
		int result = calculateFactorial(value);
		System.out.println("Factorial of " + value + " is: " + result);
	}

	public static int calculateFactorial(int value) {
		int factorial = 1;
		for (int i = 1; i <= value; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
