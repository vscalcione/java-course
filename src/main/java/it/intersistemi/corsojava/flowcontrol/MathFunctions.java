package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathFunctions {
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader console=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Write a program that prints 10 random numbers between 1 and 10 on the screen (extremes included) ");
		generateRandomValues();
		System.out.println("************************************");
		System.out.println("Write a program that calculates the square root of a number received as an argument ");
		int value = ConsoleInputInt.readInt(console, "Insert value: ");
		calculateSquareRoot(value);
		System.out.println("************************************");
		arrayRanodmValues();
		randomValueContinue();
	}

	public static void generateRandomValues() {
		int randomNumber;
		for(int index=  0; index <= 10; index++) {
			randomNumber = (int)(Math.random() * 10 + 1);
			System.out.print(" " + randomNumber);
		}
		System.out.println("");
	}
	
	public static void calculateSquareRoot(int value) {
		float squareRoot = (float) Math.sqrt(value);
		System.out.println("Sqrt: "+ value + " is: " + squareRoot);
	}
	
	public static void arrayRanodmValues() {
		int[] arrayIntRandom = new int[10];
		for(int index = 0;index < 10; index++) {
			arrayIntRandom[index]=(int)(Math.random() * 20);
			System.out.print(" | " + arrayIntRandom[index]);
		}
	}
	
	public static void randomValueContinue() {
		while(true) {
			int value = (int)(Math.random() * 15 + 1);
			if(value % 3 == 0) {
				break;
			}
			System.out.println("");
			System.out.print(value);
		}
	}
}