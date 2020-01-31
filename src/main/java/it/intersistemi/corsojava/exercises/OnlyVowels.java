package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyVowels {
	public static void main(String[] args) throws IOException{
		printVocalLetters();
		System.out.println("");
		printConsonantLetters();
	}

	public static void printVocalLetters() throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String inputString = ConsoleInputString.readString(console, "Insert element: ");
		for (int i = 0; i < inputString.length(); i++) {
			if((inputString.charAt(i) == 'a') || (inputString.charAt(i) == 'e') || (inputString.charAt(i) == 'i') || (inputString.charAt(i) == 'o') || (inputString.charAt(i) == 'u')) {
				System.out.print(inputString.charAt(i));
			}
		}	
	}

	public static void printConsonantLetters() throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String inputString = ConsoleInputString.readString(console, "Insert element: ");
		for (int i = 0; i < inputString.length(); i++) {
			if(!((inputString.charAt(i) == 'a') || (inputString.charAt(i) == 'e') || (inputString.charAt(i) == 'i') || (inputString.charAt(i) == 'o') || (inputString.charAt(i) == 'u'))) {
				System.out.print(inputString.charAt(i));
			}
		}		
	}
}