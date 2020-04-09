package it.intersistemi.corsojava.test;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulationData {


    public static int squareNumber(int value) {
        return (int) Math.pow(value, 2);
    }

    public static int product(int a, int b){
        return a * b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int value = ConsoleInputInt.readInt(console, "Insert value: ");
        System.out.println("Result: " + squareNumber(value));
    }
}
