package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintIntMatrix {

    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
        int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
        int[][] matrix = new int[rows][columns];
        populateAndPrintMatrix(matrix, rows, columns);
    }

    public static void populateAndPrintMatrix(int[][] matrix, int rows, int columns) throws IOException {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = ConsoleInputInt.readInt(console, "Insert value in position [" + i + "][" + j
                        + "]: ");
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" | " + matrix[i][j] + " | " + "\t");
            }
            System.out.println();
        }
    }
}
