package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosCounter {
	static int number;
	static int choice;
	static boolean result;
	public static void main(String[] args) throws IOException{
		do {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1. Counts if there is at least one 0 in a sequence of values ");
			System.out.println("2. Counts how many 0s are present in a sequence of values ");
			choice = ConsoleInputInt.readInt(console, "Choice: ");
			if(choice < 1 || choice > 2) {
				System.out.println("error");
			}
		}while(choice < 1 || choice > 2);
		if(choice == 1) {
			result = containsAtLeast0();
			if(result) {
				System.out.println("The sequence of values taken as input contains at least one 0 ");
			}else {
				System.out.println("The sequence of values taken as input not contains 0s ");
			}
		}
		if(choice == 2) {
			int result = contains0();
			System.out.println("In the sequence of values taken as input there're "+ result + " zero/s");
		}
	}
	
	public static boolean containsAtLeast0() throws IOException {
		boolean containsAtLeast0;
		int number;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		containsAtLeast0 = false;
		do {
			number = ConsoleInputInt.readInt(console, "Inserisci numero: ");
			if(number == 0) {
				containsAtLeast0 = true;
			}
		}while(number != -1);
		return containsAtLeast0;
	}
	
	public static int contains0() throws IOException{
		int zeros = 0;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		do {
			number = ConsoleInputInt.readInt(console, "Inserisci numero: ");
			if(number == 0) {
				zeros++;
			}
		}while(number != -1);
		return zeros;
	}
}