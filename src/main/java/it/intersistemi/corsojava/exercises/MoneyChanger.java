package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyChanger {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		int a = ConsoleInputInt.readInt(console, "Immetti un numero compreso tra 0 e 99: ");
		int b, c, d, e, f;
		if (a >= 50 && a <99) {
			System.out.println("Una moneta da 50 cent");
			b = (a - 50);
		} else {
			System.out.println("Nessuna moneta da 50 cent");
			b = a;
		}
		if (b >= 40) {
			System.out.println("Due monete da 20 cent");
			c = (b - 40);
		} else if (b >= 20 && b < 40) {
			System.out.println("Una moneta da 20 cent");
			c = b - 20;
		} else {
			System.out.println("Nessuna moneta da 20 cent");
			c = b;
		}
		if (c >= 10) {
			System.out.println("Una moneta da 10 cent");
			d = (c - 10);
		} else {
			System.out.println("Nessuna moneta da 10 cent");
			d = c;
		}
		if (d >= 5) {
			System.out.println("Una moneta da 5 cent");
			e = (d - 5);
		} else {
			System.out.println("Nessuna moneta da 5 cent");
			e = d;
		}
		if (e >= 4) {
			System.out.println("Due monete da 2 cent");
			f = (e - 4);
		} else if (e >= 2 && e < 4) {
			System.out.println("Una moneta da 2 cent");
			f = (e - 2);
		} else {
			System.out.println("Nessuna moneta da 2 cent");
			f = e;
		}
		if (f == 1) {
			System.out.println("Una moneta da 1 cent");
		} else {
			System.out.println("Nessuna moneta da 1 cent");
		}
	}
}
