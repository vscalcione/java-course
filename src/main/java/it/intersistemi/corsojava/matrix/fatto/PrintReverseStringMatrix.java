package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseStringMatrix {

	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		String[][] matrix = new String[rows][columns];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				String value = ConsoleInputString.readString(console, "Insert element at position[" + i + "][" + j +"]: ");
				matrix[i][j] = value;
			}
		}
		for(int i = rows - 1; i >= 0; i--) {
			for(int j = columns - 1; j >= 0; j--) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
