package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseMatrixInt {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
        int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                int element = ConsoleInputInt.readInt(console, "Insert value: ");
                matrix[i][j] = element;
            }
        }
        printReverseMatrix(matrix, rows, columns);
    }

    public static void printReverseMatrix(int[][] matrix, int rows, int columns){
        for(int i = rows - 1; i >= 0; i--) {
            for(int j = columns - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
