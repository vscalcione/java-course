package it.intersistemi.corsojava.matrix;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseStringArray {
	static int dimensioneArray=0;
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String[] arrayStringa = new String[dimensioneArray];
		for(int index = 0; index < arrayStringa.length; index++) {
			String valueArray = ConsoleInputString.readString(console, "Insert value: ");
			arrayStringa[index] = valueArray;
		}
		for(int index = arrayStringa.length - 1; index >= 0; index--) {
			System.out.println(arrayStringa[index]);
		}
	}
}
