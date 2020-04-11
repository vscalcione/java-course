package it.intersistemi.corsojava.test;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintArray {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int element;
	    int [] array = new int [5];
	    for (int i = 0; i < array.length; i++) {
			element = ConsoleInputInt.readInt(console, "Insert element: ");
			if (element > 0) {
				array[i] = element;
			} else {
				System.out.println("Inserted element is negative. Please insert another value > 0 ");
				i--;
			}
		}
	    for(int i = 0; i < array.length; i++) {
			System.out.println(" | " + array[i] + "\t");
	    }
	}
}
