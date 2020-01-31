package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAsterisks {
	public static void main(String[] args) throws IOException, IllegalArgumentException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String firstElement, secondElement, thirdElement;
		firstElement = ConsoleInputString.readString(console, "Inserisci stringa: ");
		secondElement = ConsoleInputString.readString(console, "Inserisci stringa: ");
		thirdElement = ConsoleInputString.readString(console, "Inserisci stringa: ");
		System.out.println("Output string: " + firstElement + "*" + secondElement + "*" + thirdElement + "*");
	}
}
