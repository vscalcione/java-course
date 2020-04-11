package it.intersistemi.corsojava.test;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int firstElement = ConsoleInputInt.readInt(console, "Insert element: ");
		int secondElement = ConsoleInputInt.readInt(console, "Insert element: ");
		System.out.println("First element: " + firstElement + "\nSecond element: " + secondElement);
		swap(firstElement, secondElement) ;
	}

	public static void swap(int a, int b) {
		int tmp = a ;
		a = b ;
		b = tmp;
		System.out.println("First element: " + a + "\nSecond element: " + b);
	}
}
