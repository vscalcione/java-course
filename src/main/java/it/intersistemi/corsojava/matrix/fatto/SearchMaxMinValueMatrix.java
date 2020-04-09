package it.intersistemi.corsojava.matrix.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SearchMaxMinValueMatrix {

    public static void loadAndPrintMatrix(int[][] matrix, int rows, int columns){
        Random value = new Random();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                int randomValue = 1 + value.nextInt(10);
                matrix[i][j] = randomValue;
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Random value = new Random();
        int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
        int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
        int matrixInt[][] = new int[rows][columns];
        System.out.println("**** Original Matrix ****");
        loadAndPrintMatrix(matrixInt, rows, columns);
        System.out.println("\n");
        System.out.println("*******************");
        searchMaxAndMinValue(matrixInt, rows, columns);
    }

    public static void searchMaxAndMinValue(int matrix[][], int rows, int columns){
        int maxValue = 0;
        int minValue = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] < minValue){
                    minValue = matrix[i][j];
                }
            }
        }

        System.out.println("Max Value is: "+ maxValue);
        System.out.println("Min Value is: "+ minValue);
    }
}
