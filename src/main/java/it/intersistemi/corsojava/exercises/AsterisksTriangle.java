package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsterisksTriangle {
	public static void main(String[] args) throws IOException, IllegalArgumentException, NumberFormatException{
		int choice;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1. Print triangle of asterisks with downward tip ");
			System.out.println("2. Print triangle of asterisks pointing upwards ");
			System.out.println("3. Print triangle of # with tip upwards ");
			System.out.println("4. Reversed triangle print of asterisks pointing downwards ");
			choice = ConsoleInputInt.readInt(console, "Choice: ");
			if(choice < 1 || choice > 4) {
				System.out.println("Error");
			}
		}while(choice <1 || choice > 4);
		int input = ConsoleInputInt.readInt(console, "How many rows? ");
		System.out.println(" ");
		if(choice == 1) {
			printTriangle(input);
		}
		if(choice == 2) {
			printTrianglebyAsterisc(input);
		}
		if(choice == 3) {
			printTrianglebyCancelletto(input);
		}
		if(choice == 4) {
			printTriangleRibaltato(input);
		}
	}
	public static void printTrianglebyAsterisc(int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void printTrianglebyCancelletto(int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
	public static void printTriangle(int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = dimension; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
			for (int k = i+1; k < i-1; ++k) {
				System.out.print(" ");
			}
		}
	}
	public static void printTriangleRibaltato(int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = dimension; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
			for (int k = 0; k < i+1; ++k) {
				System.out.print(" ");
			}
		}
	}
}