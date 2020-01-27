package it.intersistemi.corsojava.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputString {
	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
		String value = readString(console, "Insert value ");
		System.out.println("Inserted value: " + value);
	}
	
	public static String readString(BufferedReader console, String consoleMessage) throws IOException{
		do {
			System.out.print(consoleMessage);
			String line = console.readLine();
			return String.valueOf(line);
		}
		while(true);
	}
}
