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

	public void brewsOrangeJuice(float amount) throws NumberFormatException, IOException{
		amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
		if(amount < 1.20){
			while(amount < 1.20){
				System.out.print("Amount too low. Insert other coins ");
				amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
			}
		}
		if(amount == 1.20){
			System.out.println("Rest not payable ");
		}
		rest = (float)(amount - 1.20);
		System.out.println("Drink dispensed ");
		System.out.println("Rest: " + rest + " euros ");
	}

	public void brewsSandwichType1(float amount) throws NumberFormatException, IOException{
		amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
		if(amount < 1.40){
			while(amount < 1.40){
				System.out.print("Amount too low. Insert other coins ");
				amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
			}
		}
		if(amount == 1.40){
			System.out.println("Rest not payable ");
		}
		rest = (float)(amount - 1.40);
		System.out.println("Drink dispensed ");
		System.out.println("Rest: " + rest + " euros ");
	}

	public void brewsSandwichType2(float amount)throws NumberFormatException, IOException{
		amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
		if(amount < 1.60){
			while(amount < 1.60){
				System.out.print("Amount too low. Insert other coins ");
				amount = ConsoleInputFloat.readFloat(console, "Insert amount: ");
			}
		}
		if(amount == 1.60){
			System.out.println("Rest not payable ");
		}
		rest = (float)(amount - 1.60);
		System.out.println("Drink dispensed ");
		System.out.println("Rest: " + rest + " euros ");
	}

	public static void main(String[] args) throws IOException {
		float amount = (float) 0.0;
		int choice, elementChoice;
		FoodAndDrinkDistributor drinksDistributor = new FoodAndDrinkDistributor();
		FoodAndDrinkDistributor foodDistributor = new FoodAndDrinkDistributor();
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		if (!drinksDistributor.distributorStatus){
			do{
				choice = ConsoleInputInt.readInt(console, "Drink distributor off. Press 1 to turn it on ");
				if(choice != 1){
					System.out.print("Error");
				}
			}
			while(choice != 1);
			drinksDistributor.turnOnDistributor();
			do{
				System.out.println("Press 1 to brew a coffee  ");
				System.out.println("Press 2 to brew a thea ");
				System.out.println("Press 3 to brea an orange juice ");
				elementChoice = ConsoleInputInt.readInt(console, "Choice: ");
				if(elementChoice < 1 || elementChoice > 3){
					System.out.println("Error");
				}
			}
			while(elementChoice < 1 || elementChoice > 3);
			if (elementChoice == 1){
				System.out.println("Coffee brewing");
				drinksDistributor.brewsCoffee(amount);
			}
			if (elementChoice == 2){
				System.out.println("Thea brewing ");
				drinksDistributor.breawsThea(amount);
			}
			if (elementChoice == 3){
				System.out.println("Orange juice brewing ");
				drinksDistributor.brewsOrangeJuice(amount);
			}
		}
		else{
			do{
				System.out.println("Press 1 to brew a coffee  ");
				System.out.println("Press 2 to brew a thea ");
				System.out.println("Press 3 to brea an orange juice ");
				elementChoice = ConsoleInputInt.readInt(console, "Choice: ");
				if(elementChoice < 1 || elementChoice > 3){
					System.out.println("Error");
				}
			}
			while(elementChoice<1 || elementChoice>3);
			if (elementChoice == 1){
				System.out.println("Coffee brewing ");
				drinksDistributor.brewsCoffee(amount);
			}
			if (elementChoice == 2){
				System.out.println("Thea brewing ");
				drinksDistributor.breawsThea(amount);
			}
			if (elementChoice == 3){
				System.out.println("Orange juice brewing ");
				drinksDistributor.brewsOrangeJuice(amount);
			}
		}
		if (!foodDistributor.distributorStatus){
			do{
				choice = ConsoleInputInt.readInt(console, "Food distributor off. Press 1 to turn it on ");
				if(choice != 1){
					System.out.print("Error");
				}
			}
			while (choice != 1);
			foodDistributor.turnOnDistributor();
			do{
				System.out.println("Press 1 to brews 1st type of sandwich ");
				System.out.println("Press 2 to brews 2nd type of sandwich ");
				elementChoice = ConsoleInputInt.readInt(console, "Choice: ");
				if(elementChoice < 1 || elementChoice > 2){
					System.out.print("Error");
				}
			}
			while(elementChoice < 1 || elementChoice > 2);
			if (elementChoice == 1){
				System.out.println("1st Sandwich type brewing ");
				foodDistributor.brewsSandwichType1(amount);
			}
			if (elementChoice == 2){
				System.out.println("2st Sandwich type brewing ");
				foodDistributor.brewsSandwichType2(amount);
			}
		}
		drinksDistributor.turnOffDistributor();
		foodDistributor.turnOffDistributor();
	}
}