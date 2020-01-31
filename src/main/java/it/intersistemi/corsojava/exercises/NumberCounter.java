package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCounter {
	int value;
	public NumberCounter(int number) {
		value = number;
	}
	public void printCount() {
		if(value >= 0) {
			System.out.println("The numbers to count are: "+value);
			for (int index = 0; index <= value; index++) {
				System.out.print(" " + index);
			}
		}
		else {
			System.out.println("I can't count the negative numbers ... ");
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Insert value: ");
		NumberCounter counter = new NumberCounter(value);
		counter.printCount();
	}

}
