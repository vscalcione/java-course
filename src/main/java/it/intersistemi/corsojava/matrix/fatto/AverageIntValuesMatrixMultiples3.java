package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AverageIntValuesMatrixMultiples3 {

	public static void main(String[] args) throws IOException{
		Random rndValue = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				matrix[i][j] = rndValue.nextInt(10);
			}
		}
		printMatrix(matrix, rows, columns);
		System.out.println("\nAverage of only elements divisible for 3 in your matrix: " + averageMatrix(matrix, rows, columns));
	}

	public static void printMatrix(int[][] matrix, int rows, int columns){
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				System.out.print(" | " + matrix[i][j] + " | " + "\t");
			}
			System.out.println();
		}
	}

	public static float averageMatrix(int[][] matrix, int rows, int columns) {
		int sum = 0, count = 0;
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++)
			if(matrix[i][j] % 3 == 0) {
				count++;
				sum += matrix[i][j];
			}
		}
		return (float) sum / (count);
	}
}
