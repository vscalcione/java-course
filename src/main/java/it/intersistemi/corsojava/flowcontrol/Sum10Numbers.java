package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum10Numbers {
	public static void main(String[] args) throws IOException, NumberFormatException, IllegalArgumentException{
		int number, sum = 0;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		for (int index = 0; index < 10; index++) {
			number = ConsoleInputInt.readInt(console, "Insert value " + (index +1) + " : ");
			sum += number;
		}
		System.out.println("Sum is: " + sum);
	}
}
