package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatenateStrings {
	public static void main(String[] args) throws IOException{
		String firstString, secondString, thirdString;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		firstString = ConsoleInputString.readString(console, "Insert first string: ");
		secondString = ConsoleInputString.readString(console, "Insert second string: ");
		thirdString = ConsoleInputString.readString(console, "Insert third string: ");
		System.out.println("Obtained result: " + "*" + firstString + "*" + secondString + "*" + thirdString + "*");
	}
}