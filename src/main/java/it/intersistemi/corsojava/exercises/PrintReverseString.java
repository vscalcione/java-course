package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseString {
	public static void main(String[] args) throws IOException{
		String insertedString;
		String reverseString = "";
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		insertedString = ConsoleInputString.readString(console, "Insert value: ");
		System.out.println("****** Original string -> " + insertedString + " ****** ");
		for (int i = insertedString.length() - 1; i >=  0; i--) {
			reverseString += insertedString.charAt(i);
		}
		System.out.println("****** Reversed string -> " + reverseString + " ****** ");
	}
}
