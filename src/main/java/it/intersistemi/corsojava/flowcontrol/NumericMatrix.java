package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumericMatrix {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
		int numRows = ConsoleInputInt.readInt(console,"How many rows? ");
		int numColumns = ConsoleInputInt.readInt(console,"How many columns? ");
		int [][] numericMatrix = new int[numRows][numColumns];
		for(int index = 0; index < numRows; index++) {
			numericMatrix[index][0] = ConsoleInputInt.readInt(console, "Insert started value: ");
			for(int index2 = 1; index2 < numColumns; index2++) {
				numericMatrix[index][index2] = numericMatrix[index][index2 - 1] + 1;
			}
		}
		System.out.println("Obtained Matrix: ");
		for(int index = 0; index < numRows; index++) {
			for(int variable : numericMatrix[index]) {
				System.out.print("| " + variable + "|");
			}
			System.out.println("");
		}
	}
}