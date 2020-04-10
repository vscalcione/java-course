package it.intersistemi.corsojava.matrix;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MatrixContainsMain {

	public static void main(String[] args) throws InterruptedException, IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Random value = new Random();
		int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
		int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
		int matrixInt[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				matrixInt[i][j] = value.nextInt(100);
				System.out.print(matrixInt[i][j] + (i < matrixInt.length - 1 ? ", " : "") + "\n");
			}
		}
		while(true) {
			int tmp = value.nextInt(100);
			boolean booleanVariable = contains(tmp, matrixInt, rows, columns);
			if(booleanVariable) {
				System.out.println("Value present: " + tmp);
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean contains(int element, int[][] matrixInt, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				if(matrixInt[i][j] == element){
					return true;
				}
			}
		}
		return false;
	}

	public static boolean contains(Object e, Object matrixInt[][], int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				if(matrixInt[i][j].equals(e)) {
					return true;
				}
			}
		}
		return false;
	}
}
