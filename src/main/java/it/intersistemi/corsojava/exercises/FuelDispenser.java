package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputDouble;
import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuelDispenser {
	public static double amount, refueledDiesel, refueledPetrol;
	public static void main(String[] args) throws IOException{
		int choice, response;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		FuelDispenser firstFuelDispenser = new FuelDispenser();
		FuelDispenser secondFuelDispenser = new FuelDispenser();
		do {
			do {
				System.out.println("=======================");
				choice = ConsoleInputInt.readInt(console, "Press 1 to dispense petrol or 2 to dispense diesel fuel ");
				if(choice <1 || choice > 2) {
					System.out.println("Error ");
				}
			} while (choice < 1 || choice > 2);
			if(choice == 1) {
				amount = ConsoleInputDouble.readDouble(console, "Insert amount: ");
				firstFuelDispenser.getPetrol(amount);
			}
			if(choice == 2) {
				amount = ConsoleInputDouble.readDouble(console, "Insert amount: ");
				secondFuelDispenser.getDieselFuel(amount);
			}
			response = ConsoleInputInt.readInt(console, "Does the user want to perform another operation? 1 = yes, 0 = no ");
			if(response == 0 || response != 1) {
				break;
			}
		} while (response == 1);
	}
	public void getPetrol(double amount) {
		refueledPetrol = (float)((float) amount / 1.330);
		System.out.println("Refuel of "+ refueledPetrol +" liter of petrol at 1.330 euros/liter ");
	}
	public void getDieselFuel(double amount) {
		refueledDiesel = (float)((float) amount / 1.520);
		System.out.println("Refuel of "+ refueledDiesel +" liter of diesel at 1.520 euros/liter ");
	}
}