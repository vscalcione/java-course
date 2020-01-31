package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputFloat;
import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodAndDrinkDistributor {
	float rest, amount;
	boolean distributorStatus = false;
	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	public void turnOnDistributor() {
		distributorStatus = true;
	}

	public void turnOffDistributor(){
		distributorStatus = false;
	}

	public void brewsCoffee(float amount) throws NumberFormatException, IOException{
		float rest;
		amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
		if(amount < 0.80){
			while(amount < 0.80){
				System.out.print("Amount too low. Insert other coins ");
				amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
			}
		}
		if(amount == 0.80){
			System.out.println("Rest not payable ");
		}
		rest = (float)(amount - 0.80);
		System.out.println("Drink dispensed ");
		System.out.println("Rest: "+ rest + " euros ");
	}

	public void breawsThea(float amount) throws NumberFormatException, IOException{
		float rest;
		amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
		if(amount < 1.10){
			while(amount < 1.10){
				System.out.print("Amount too low. Insert other coins ");
				amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
			}
		}
		if(amount == 1.10){
			System.out.println("Rest not payable ");
		}
		rest=(float) (amount - 1.10);
		System.out.println("Drink dispensed ");
		System.out.println("Rest: " + rest + " euros ");
	}

	public void brewsOrangeJuice(float importo) throws NumberFormatException, IOException{
		importo = ConsoleInputFloat.readFloat(console, "Inserire importo: ");
		if(importo < 1.20){
			while(importo<1.20){
				System.out.print("Importo troppo basso. Inserire altre monete ");
				importo = ConsoleInputFloat.readFloat(console, "Inserire importo: ");
			}
		}
		if(importo == 1.20){
			System.out.println("Resto non erogabile");
		}
		rest =(float)(importo - 1.20);
		System.out.println("Bevanda erogata ");
		System.out.println("Il resto � di: "+ rest +" euro ");
	}

	public void brewsSandwichType1(float amount) throws NumberFormatException, IOException{
		amount = ConsoleInputFloat.readFloat(console, "Inserire amount: ");
		if(amount < 1.40){
			while(amount < 1.40){
				System.out.print("Importo troppo basso. Inserire altre monete ");
				amount = ConsoleInputFloat.readFloat(console, "Inserire amount: ");
			}
		}
		if(amount == 1.40){
			System.out.println("Resto non erogabile");
		}
		rest =(float)(amount - 1.40);
		System.out.println("Bevanda erogata ");
		System.out.println("Il resto � di: "+ rest +" euro ");
	}

	public void brewsSandwichType2(float importo)throws NumberFormatException, IOException{
		importo = ConsoleInputFloat.readFloat(console, "Inserire importo: ");
		if(importo < 1.60){
			while(importo < 1.60){
				System.out.print("Importo troppo basso. Inserire altre monete ");
				importo = ConsoleInputFloat.readFloat(console, "Inserire importo: ");
			}
		}
		if(importo == 1.60){
			System.out.println("Resto non erogabile");
		}
		rest =(float)(importo - 1.60);
		System.out.println("Bevanda erogata ");
		System.out.println("Il resto � di: "+ rest +" euro ");
	}

	public static void main(String[] args) {
		float amount;
		public static void main(String[] args) throws IOException, NumberFormatException {
			int choice, var;
			FoodAndDrinkDistributor drinksDistributor = new FoodAndDrinkDistributor();
			FoodAndDrinkDistributor foodDistributor = new FoodAndDrinkDistributor();
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			if (!drinksDistributor.distributorStatus){
				do{
					choice = ConsoleInputInt.readInt(console, "ErogatoreBevande spento. Premere 1 per accenderlo ");
					if(choice != 1){
						System.out.print("Error");
					}
				}
				while(choice != 1);
				drinksDistributor.turnOnDistributor();
				do{
					System.out.println("Premere 1 per erogare un caff� ");
					System.out.println("Premre 2 per erogare un thea ");
					System.out.println("Premere 3 per erogare un'aranciata ");
					var = ConsoleInputInteri.leggiIntero(console, "Scelta: ");
					if(var<1 || var>3){
						System.out.println("Error");
					}
				}
				while(var<1 || var>3);
				if (var == 1){
					System.out.println("Erogazione caff� ");
					drinksDistributor.brewsCoffee(amount);
				}
				if (var == 2){
					System.out.println("Erogazione thea ");
					drinksDistributor.breawsThea(amount);
				}
				if (var == 3){
					System.out.println("Erogazione aranciata ");
					drinksDistributor.brewsOrangeJuice(amount);
				}
			}
			else{
				do{
					System.out.println("Premere 1 per erogare un caff� ");
					System.out.println("Premere 2 per erogare un thea ");
					System.out.println("Premere 3 per erogare un'aranciata ");
					var = ConsoleInputInteri.leggiIntero(console, "Scelta: ");
					if (var<1 || var>3){
						System.out.print("Error");;
					}
				}
				while(var<1 || var>3);
				if (var == 1){
					System.out.println("Erogazione caff� ");
					drinksDistributor.brewsCoffee(amount);
				}
				if (var == 2){
					System.out.println("Erogazione thea ");
					drinksDistributor.breawsThea(amount);
				}
				if (var == 3){
					System.out.println("Erogazione aranciata ");
					drinksDistributor.brewsOrangeJuice(amount);
				}
			}
			if (foodDistributor.distributorStatus==false){
				do{
					choice = ConsoleInputInteri.leggiIntero(console, "ErogatoreCibi spento. Premere 1 per accenderlo ");
					if(choice != 1){
						System.out.print("Error");
					}
				}
				while (choice != 1);
				foodDistributor.turnOnDistributor();
				do{
					System.out.println("Premere 1 per erogare un panino ");
					System.out.println("Premere 2 per erogare un tramezzino ");
					var = ConsoleInputInteri.leggiIntero(console, "Scelta: ");
					if(var<1 || var>2){
						System.out.print("Error");
					}
				}
				while(var<1 || var>2);
				if (var == 1){
					System.out.println("Erogazione panino ");
					foodDistributor.brewsSandwichType1(amount);
				}
				if (var == 2){
					System.out.println("Erogazione tramezzino ");
					foodDistributor.brewsSandwichType2(amount);
				}
			}
			drinksDistributor.turnOffDistributor();
			foodDistributor.turnOffDistributor();
		}
	}
}