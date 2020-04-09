package it.intersistemi.corsojava.array;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintReverseArrayInt {

    static int dimension = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[dimension];
        for(int index = 0; index < array.length; index++){
            int element = ConsoleInputInt.readInt(console, "Insert value: ");
            array[index] = element;
        }
        for(int index = array.length - 1; index >= 0; index--){
            System.out.println(array[index]);
        }
    }
}
