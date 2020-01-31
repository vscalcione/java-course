package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseArray {
	public static int arrayDimension = 0;
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		arrayDimension = ConsoleInputInt.readInt(console, "Insert dimension's array: ");
		String[] arrayStringa=new String[arrayDimension];
		printReverseArray(console, arrayStringa);
	}
	
	public static void printReverseArray(BufferedReader console, String[] stringArray) throws IOException {
		for(int index = 0; index < stringArray.length; index++) {
			String valueArray = ConsoleInputString.readString(console, "Insert value: ");
			stringArray[index] = valueArray;
		}
		System.out.println("Print reversed array: ");
		for(int i=stringArray.length-1; i>=0; i--) {
			System.out.print(stringArray[i]+" , ");
		}
	}
}