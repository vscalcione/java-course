package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTomorrow {

	static final int january = 1;
	static final int february = 2;
	static final int march = 3;
	static final int april = 4;
	static final int may = 5;
	static final int june = 6;
	static final int july = 7;
	static final int august = 8;
	static final int setptember = 9;
	static final int october = 10;
	static final int november = 11;
	static final int dicember = 12;

	public static void main(String[] args) throws IOException{
		System.out.println("========================");
		int currentDay, currentYear;
		int currentMonth;
		int tomorrowMonth;
		int tomorrowDay, tomorrowYear;
		int currentMonthDuration;
		boolean leapYear = false;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserisci la data di oggi: ");
		currentDay = ConsoleInputInt.readInt(console, "Day: ");
		currentMonth = ConsoleInputInt.readInt(console, "Month: ");
		currentYear = ConsoleInputInt.readInt(console, "Year: ");
		if (currentYear % 400 == 0 || (currentYear % 4 == 0 && currentYear % 100 != 0)) {
			leapYear = true;
		}
		if(currentMonth == february && leapYear == true) {
			currentMonthDuration = 29;
		}else if(currentMonth == february) {
			currentMonthDuration = 28;
		}else if(currentMonth == april || currentMonth == june || currentMonth == setptember || currentMonth == november) {
			currentMonthDuration = 30;
		}else {
			currentMonthDuration = 31;
		}
		if(currentMonth == dicember && currentDay == currentMonthDuration) {
			tomorrowDay = 1;
			tomorrowMonth = (int)(currentMonth + 1);
			tomorrowYear = currentYear + 1;
		}else if(currentDay == currentMonthDuration) {
			tomorrowDay = 1;
			tomorrowMonth = currentMonth + 1;
			tomorrowYear = currentYear;
		}else {
			tomorrowDay = currentDay + 1;
			tomorrowMonth = currentMonth;
			tomorrowYear = currentYear;
		}
		System.out.println("Tomorrow date is:  " + tomorrowDay + "/" + tomorrowMonth + "/" + tomorrowYear);
	}
}