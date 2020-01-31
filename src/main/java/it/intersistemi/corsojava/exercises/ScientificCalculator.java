package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputDouble;
import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScientificCalculator {
	public static void main(String[] args) throws IOException, IllegalArgumentException, NumberFormatException{
		int choice, response;
		double firstValue, secondValue, value;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		do {
			do {
				printScientificCalculatorMenu();
				choice = ConsoleInputInt.readInt(console, "Scelta: ");
			} while (choice < 1 || choice > 8);
			if(choice == 1) {
				System.out.println("Sum");
				firstValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				secondValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Sum: " + scientificCalculator.sum(firstValue, secondValue));
			}
			if(choice == 2) {
				System.out.println("Difference");
				firstValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				secondValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Difference: " + scientificCalculator.difference(firstValue, secondValue));
			}
			if(choice == 3) {
				System.out.println("Product");
				firstValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				secondValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Product: " + scientificCalculator.product(firstValue, secondValue));
			}
			if(choice == 4) {
				System.out.println("Quozient");
				firstValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				secondValue = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Quozient: " + scientificCalculator.division(firstValue, secondValue));
			}
			if(choice == 5) {
				System.out.println("Factorial");
				value = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Factorial: "+ scientificCalculator.factorial(value));
			}
			if(choice == 6) {
				System.out.println("Pow ");
				firstValue = ConsoleInputDouble.readDouble(console, "Inserisci base: ");
				secondValue = ConsoleInputDouble.readDouble(console, "Inserisci esponente: ");
				System.out.println("Pow of " + firstValue + " at " + secondValue + " : " + scientificCalculator.pow(firstValue, secondValue));
			}
			if(choice == 7) {
				System.out.println("Square ");
				value = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Square of "+ value + " :" + scientificCalculator.square(value));
			}
			if(choice == 8) {
				System.out.println("Cube ");
				value = ConsoleInputDouble.readDouble(console, "Insert value: ");
				System.out.println("Cube of " + value + " :" + scientificCalculator.cube(value));
			}
			response = ConsoleInputInt.readInt(console, "Does the user want to perform another operation?  1 = yes 0 = no ");
			if(response == 0  || response != 1) {
				break;
			}
		} while (response == 1);
	}

	public static void printScientificCalculatorMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("| 1. Sum ");
		System.out.println("| 2. Difference ");
		System.out.println("| 3. Product ");
		System.out.println("| 4. Quozient ");
		System.out.println("| 5. Factorial of a number ");
		System.out.println("| 6. Pow ");
		System.out.println("| 7. Square of a number ");
		System.out.println("| 8. Cube of a number ");
		System.out.println("----------------------------------------------");
	}

	public double sum (double firstValue, double secondValue) {
		return firstValue + secondValue;
	}
	public double difference (double firstValue, double secondValue) {
		return firstValue - secondValue;
	}
	public double product (double firstValue, double secondValue) {
		return firstValue * secondValue;
	}
	public double division (double firstValue, double secondValue) {
		if(firstValue == 0 || secondValue == 0) {
			return -1;
		}else {
			return (firstValue / secondValue);
		}
	}

	public double factorial  (double value) {
		if(value == 0) {
			return 1;
		}else {
			return (value * factorial (value-1));
		}
	}

	public double pow(double base, double exponent) {
		double result;
		if(exponent <= 0) {
			return 1;
		}else {
			result = Math.pow(base, exponent);
			return result;
		}
	}

	public double square (double value) {
		return Math.pow(value, 2);
	}

	public double cube (double value) {
		return Math.pow(value, 3);
	}
}