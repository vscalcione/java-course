package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChineseMorra {
	public static void main(String[] args) throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String continueGame;
		String firstPlayer = ConsoleInputString.readString(console, "FirstGamer name: ");
		String secondPlayer = ConsoleInputString.readString(console, "SecondGamer name: ");
		do {
			System.out.println(" ==== FirstPlayer round: "+firstPlayer);
			String launchFirstPlayer = ConsoleInputString.readString(console, "Launch: ");
			System.out.println(" === SecondPlayer round: " + secondPlayer);
			String launchSecondPlayer = ConsoleInputString.readString(console, "Launch: ");
			if(launchFirstPlayer.equals("paper") && launchSecondPlayer.equals("stone")) {
				System.out.println(firstPlayer + " wins");
			}
			else if(launchFirstPlayer.equals("paper") && launchSecondPlayer.equals("scissors")) {
				System.out.println(secondPlayer + " wins");
			}
			else if(launchFirstPlayer.equals("stone") && launchSecondPlayer.equals("paper")) {
				System.out.println(secondPlayer + " wins");
			}
			else if(launchFirstPlayer.equals("stone") && launchSecondPlayer.equals("scissors")) {
				System.out.println(firstPlayer + " wins");
			}
			else if(launchFirstPlayer.equals("scissors") && launchSecondPlayer.equals("stone")) {
				System.out.println(secondPlayer + " wins");
			}
			else if(launchFirstPlayer.equals("scissors") && launchSecondPlayer.equals("paper")) {
				System.out.println(firstPlayer + " wins");
			}
			else if(launchFirstPlayer.equals(launchSecondPlayer)) {
				System.out.println("You launched the same thing ");
			}
			else {
				System.out.println("Input not valid! ");
			}
			continueGame = ConsoleInputString.readString(console, "Want to make another game? ");
			if(!continueGame.equalsIgnoreCase("yes")) {
				System.out.println("END GAME ");
			}
		}
		while(continueGame.equalsIgnoreCase("yes"));
	}
}