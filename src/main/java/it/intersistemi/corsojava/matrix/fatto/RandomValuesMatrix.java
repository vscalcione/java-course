package it.intersistemi.corsojava.matrix.fatto;
import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomValuesMatrix {
	public static void main(String[] args) throws IOException {
        Random randomValue = new Random();
        int tmp = 0;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("********** Obtained result: *************** ");
        int rows = ConsoleInputInt.readInt(console, "Insert rows: ");
        int columns = ConsoleInputInt.readInt(console, "Insert columns: ");
        int randomMatrix[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                randomMatrix[i][j] = randomValue.nextInt(50);
                if(randomMatrix[i][j] != 0 && randomMatrix[i][j] % 2 == 0){
                    tmp = randomMatrix[i][j];
                    System.out.println(randomMatrix[i][j] + " | ");
                }
            }
        }
	}
}
