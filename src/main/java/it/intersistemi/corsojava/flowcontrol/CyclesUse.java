package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclesUse {
	public static void main(String[] args) throws IOException, NumberFormatException{
		printFirst10Numbers();
		System.out.println("");
		System.out.println("********************************");
		System.out.println("Write a program that prints the first then whole pair numbers between 20 and 0, startint to 20. ");
		printFirst20PairNumbers();
		System.out.println("Write a program that print the table of number taked as argument: ");
		BufferedReader console=new BufferedReader (new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Value whose table is to be calculated: ");
		printTable(value);
	}
	
	private static void printFirst10Numbers() {
		System.out.println(" Write a program that prints the first ten whole numbers on the screen ");
		for(int counter = 1; counter < 11; counter++) {
			System.out.print(counter);
		}
	}
	
	public static void printFirst20PairNumbers() {
		for(int count = 20; count > 0; count--) {
			if(count % 2 == 0) {
				System.out.println("Pair value: " + count + ": " + count);
			}
		}
	}
	
	public static void printTable(int value) {
		System.out.println("Table: " + value);
		for(int index = 0; index <= 10; index++) {
			if(index == 11) {
				break;
			}
			else {
				System.out.println(value + " x " + index + " = " + value * (index));
			}
		}
	}
}