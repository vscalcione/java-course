package it.intersistemi.corsojava.matrix.fatto;


import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MatrixSorted {

	public static void main(String[] args) throws IOException {
		Random value = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		int[][] matrix = new int[rows][columns];
		System.out.println("Original Matrix ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = value.nextInt(10);
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("");
		boolean check = isCrescente(matrix, rows, columns);
		if(check) {
			System.out.println("Array ordered in ascending order ");
		}
		else {
			System.out.println("Array not sorted or not in ascending order ");
			sortMatrix(matrix, rows, columns);
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

	public static void sortMatrix(int[][] matrix, int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				for(int k = 0; k < columns - 1; k++){
					if(matrix[i][k] > matrix[i][k + 1]){
						int tmp = matrix[i][k + 1];
						matrix[i][k + 1] = matrix[i][k];
						matrix[i][k] = tmp;
					}
				}
			}
		}
	}

	public static boolean isCrescente(int matrix[][], int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; i < columns; j++) {
				if(matrix[i][j] >= matrix[i][j + 1] && matrix[i][j] >= matrix[i + 1][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
