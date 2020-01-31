package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfUse {
	public static void main(String[] args) throws IOException, IllegalArgumentException, NumberFormatException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int value = ConsoleInputInt.readInt(console, "Inserisci un valore: ");
		if(value == 10) {
			System.out.println("The value you entered is 10 ");
		}else if(value > 10) {
			System.out.println("The value you entered is greater than 10: " + value);
		}
		else {
			System.out.println("The value you entered is less than 10: " + value);
		}
	}
}
