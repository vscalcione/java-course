package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateAge {

	public static void main(String[] args) throws IOException{
		int year = 0;
		int month = 0;
		int day = 0;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("Insert current date ");
			int currentYear = ConsoleInputInt.readInt(console, "Current Year: ");
			int currentMonth = ConsoleInputInt.readInt(console, "Current Month: ");
			int currentDay = ConsoleInputInt.readInt(console, "Current Day: ");
			System.out.println("Current Date: " + currentDay+  "/" + currentMonth + "/" + currentYear);
			System.out.println("==========================");
			System.out.println("Insert your birthdate ");
			int birthYear =  ConsoleInputInt.readInt(console, "Born Year : ");
			int birthMonth = ConsoleInputInt.readInt(console, "Born Month : ");
			int birthDay = ConsoleInputInt.readInt(console, "Born Day : ");
			System.out.println("BirthDate: " + birthDay + "/" + birthMonth + "/" + birthYear);
			year = currentYear - birthYear;
			if(birthMonth > currentMonth) {
				year--;
				month = (12 + currentMonth) - birthMonth;
			}else {
				month = currentMonth - birthMonth;
			}
			if(birthDay > currentDay) {
				month--;
				day = (31 - birthDay) + currentDay;
			}
			else {
				day = currentDay - birthDay;
			}
			if(month == 0) {
				System.out.println("Have " + year + " years and "+ day + " days ");
			}
			else {
				System.out.println("Have "+ year + " years and "+ month +" months and "+ day + " days ");
			}
			choice = ConsoleInputInt.readInt(console, "Do you want to perform another age calculation? Press 1 to continue ");
			if(choice == 0) {
				System.out.println("Calculate Terminated");
				break;
			}
		}
		while(choice != 0);
	}
}