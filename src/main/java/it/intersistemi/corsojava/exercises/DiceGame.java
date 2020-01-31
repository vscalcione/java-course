package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame {
	public static void main(String[] args) throws IOException, IllegalArgumentException, NumberFormatException{
		int choice, response;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		Dice dice = new Dice();
		do {
			do {
				choice = ConsoleInputInt.readInt(console, "Press 1 to launch dades ");
				if(choice != 1) {
					System.out.println("Error");
				}
			}
			while(choice != 1);
			int firstLaunch = dice.launchFirstDice();
			int secondLaunch = dice.launchSecondDice();
			int resultLaunch = firstLaunch + secondLaunch;
			System.out.println("--------------------");
			System.out.println("Launching result: "+ resultLaunch);
			response = ConsoleInputInt.readInt(console, "Do you want to launch the dice again? 1 = yes ");
			if(response != 1) {
				System.out.println("Error");
				break;
			}
		} while (response == 1);
	}
	public static class Dice {
		public int launchFirstDice() {
			int launching = (int) (1 + 12 * Math.random());
			System.out.println("First dade: "+ launching);
			return launching;
		}
		public int launchSecondDice() {
			int launching = (int) (1 + 12 * Math.random());
			System.out.println("Second dade: "+ launching);
			return launching;
		}
	}
}