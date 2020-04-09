package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsterisksSquare {
	int value;
	public AsterisksSquare(int side) {
		value = side;
	}
	
	public void printSquare() {
		if(value > 0) {
			for (int firstIndex = 0; firstIndex < value; firstIndex++) {
				for (int secondIndex = 0; secondIndex < value; secondIndex++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			}
		}
		else {
			System.out.println("You insert a negative value ");
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Insert value: ");
		AsterisksSquare asteriskSquare = new AsterisksSquare(value);
		asteriskSquare.printSquare();
	}
}
