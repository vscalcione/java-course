package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AverageIntValuesArray {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		int matrix[][] = new int[rows][columns];
		loadAndPrintMatrix(matrix, rows, columns);
		float result = averageArray(matrix, rows, columns);
		System.out.println("Average of your element's array " + result);
	}

	public static void loadAndPrintMatrix(int matrix[][], int rows, int columns){
		Random value = new Random();
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				matrix[i][j] = value.nextInt(10);
			}
		}

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static float averageArray(int matrix[][], int rows, int columns) {
		int sum = 0;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				sum += matrix[i][j];
			}
		}
		return (float) sum / (rows + columns);
	}

}
