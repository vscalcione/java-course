package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MatrixMaxIndex {

	public static void main(String[] args) throws IOException {
		int result = searchMaxIndex();
		System.out.println("**********************");
		System.out.println("Max element of the array is located in position:  [" + result + "]");
	}

	public static int searchMaxIndex() throws IOException {
		Random value = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		int[][] matrix = new int[rows][columns];
		System.out.println("Generated Array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = value.nextInt(100);
				System.out.println("Position [" + i + "][" + j + "] : " + matrix[i][j]);
			}
		}
		int max, maxIndex;
		maxIndex = matrix[0][0];
		max = matrix[0][0];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; i < columns; i++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxIndex = i;
				}
			}
		}
		return maxIndex;
	}
}
