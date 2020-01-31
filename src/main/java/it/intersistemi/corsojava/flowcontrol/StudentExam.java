package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentExam {
	public static void main(String[] args) throws IOException, NumberFormatException{
		int finalVote;
		int writtenExamVote;
		int practicalExamVote;
		BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
		writtenExamVote = ConsoleInputInt.readInt(console, "Written exam vote: ");
		practicalExamVote = ConsoleInputInt.readInt(console, "Practical exam vote: ");
		finalVote = writtenExamVote + practicalExamVote;
		if((writtenExamVote <= 0 && finalVote > 18) || (writtenExamVote <= 0 && practicalExamVote < 18) || (writtenExamVote > 0 && finalVote < 18)) {
			System.out.println("I'm sorry, you were rejected!");
		}
		else{
			if(finalVote == 31 || finalVote == 32) {
				System.out.println("Congratulations, 30 and praise");
			}
			else {
				System.out.println("You're promoted and your final grade is: :" + finalVote);
			}
		}
	}
}