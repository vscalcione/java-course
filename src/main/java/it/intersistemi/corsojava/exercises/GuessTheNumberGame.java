package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNumberGame {
	public static void main(String[] args) throws IOException{
		inizializeGame();
	}
	public static void inizializeGame() throws IOException {
		int chosenNumber, attempt, performedAttemps;
		final int max = 100, end = 0;
		Random rndValue = new Random();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		chosenNumber = (int) rndValue.nextInt(max+1);
		System.out.println("I thought of an integer value between 1 and " + max);
		System.out.println("Guess which number I thought. " + "\n" + "Remember that you can type "+ end+ " to end the game ");
		performedAttemps = 1;
		System.out.println("==========================");
		System.out.println("Attempt " + performedAttemps);
		attempt = ConsoleInputInt.readInt(console, "Guess the number: ");
		while(attempt != chosenNumber && attempt != end) {
			if(attempt < chosenNumber) {
				System.out.println(attempt + " too low");
			}else {
				System.out.println(attempt + " too high ");
			}
			performedAttemps++;
			System.out.println("====================");
			System.out.println("Tentativo_"+performedAttemps);
			attempt = ConsoleInputInt.readInt(console, "Guess the number: ");
		}
		if(attempt == chosenNumber) {
			System.out.println("Good. You guessed the number by doing " + performedAttemps+" attempts! ");
		}else {
			System.out.println("The number I had chosen was:: "+chosenNumber);
			System.out.println("It was a pleasure to play with you ");
		}
	}
}