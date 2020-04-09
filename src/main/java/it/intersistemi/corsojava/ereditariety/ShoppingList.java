package it.intersistemi.corsojava.ereditariety;


import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.lambdaexpressions.exercises.library.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShoppingList extends MarketProduct {

    String principalMaterial;
    Data data;
    // ListaSpesa [] carrello;


	public ShoppingList(String name, int barCode, String description, double price, String principalMaterial, Data data) {
		super(name, barCode, description, price);
		this.principalMaterial = principalMaterial;
		this.data = data;
	}

	public String getPrincipalMaterial() {
		return principalMaterial;
	}

	public void setPrincipalMaterial(String principalMaterial) {
		this.principalMaterial = principalMaterial;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ShoppingList{" +
				"principalMaterial='" + principalMaterial + '\'' +
				", data=" + data +
				'}';
	}

	public static void main(String[] args) throws IOException {

		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		ShoppingList product1 = new ShoppingList("Birra Lager", 1704294702, "Artigianale", 4.0, "luppolo", new Data(12, 12, 2017));
		ShoppingList product2 = new ShoppingList("Calzini", 1704294223, "Maschili", 2.2, "plastica", new Data(12, 11, 2017));
		ShoppingList product3 = new ShoppingList("Salame", 1704217702, "Fatto in casa", 3.4, "carne", new Data(19, 11, 2017));
		ShoppingList product4 = new ShoppingList("Padella", 1723294702, "Inox", 12.4, "acciaio", new Data(21, 11, 2017));

		System.out.println("Good Morning");

		System.out.println("Choose " + product1.getName() + " pressing 0");
		System.out.println("Choose " + product2.getName() + " pressing 1");
		System.out.println("Choose " + product3.getName() + " pressing 2");
		System.out.println("Choose " + product4.getName() + " pressing 3");

		ShoppingList[] magazzino = new ShoppingList[10];

		magazzino[0] = product1;
		magazzino[1] = product2;
		magazzino[2] = product3;
		magazzino[3] = product4;

		ShoppingList[] carrello = new ShoppingList[10]; // mi fa fare richieste obbligatorie??

		int i;
		double somma = 0;
		int scelta;
		// int acquista = 0;

		// while (acquista==1)
		for (i = 0; i < carrello.length; i++) {
			scelta = ConsoleInputInt.readInt(console, "Insert value: ");
			carrello[i] = magazzino[scelta];
			if (carrello[i] != null) {
				System.out.println("Hai scelto: " + carrello[i] + " ");
				System.out.println(" digita 5 per pagare");
			}
			if (scelta == 5) {
				break;
			}
		}

		System.out.println("");
		for (i = 0; i < carrello.length; i++) {
			if (carrello[i] != null) {
				System.out.println("Nel tuo carrelloe e'  presente: " + carrello[i]);
			}
			if (carrello[i] != null) {
				somma = somma + carrello[i].getPrice();
			}
		}
		System.out.println("Il totale da pagare e': " + somma);
	}

//	public static void anotherMethod(){
//		ListaSpesa[] carrello = { "prodotto1", "prodotto2", "prodotto3", "prodotto4" };
//		if (n == 1) {
//			while (uscita != "ESC") {
//				System.out.println(" Scegli prodotto ");
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("Se ha la tessera digiti 1, altrimenti qualsiasi altro tasto per andare avanti."
//						+ "Digiti Con + invio per continuare, ESC + invio per uscire e/o completare l 'ordine");
//				int n = scanner.nextInt();
//				do {
//					ListaSpesa[] carrello = {prodotto1, prodotto2, prodotto3, prodotto4};
//					int j;
//					double somma = 0;
//					for (j = 0; j < 4; j++) {
//						if (carrello[i] != null) {
//							carrello[i] = magazzino[scelta];
//							if (carrello[i] != null) {
//								System.out.println(carrello[i]);
//							} else {
//								System.out.println("Nessun prodotto selezionato");
//							}
//							if (scelta == 1) {
//								somma = somma + prodotto1.getPrezzoUnitario();
//								carrello[1] = prodotto1;
//							} else if (scelta == 2) {
//								somma = somma + prodotto2.getPrezzoUnitario();
//								carrello[2] = prodotto2;
//							} else if (scelta == 3) {
//								somma = somma + prodotto2.getPrezzoUnitario();
//								carrello[3] = prodotto3;
//							} else if (scelta == 4) {
//								somma = somma + prodotto4.getPrezzoUnitario();
//								carrello[4] = prodotto4;
//							} else {
//								System.out.print("Nessuna scelta valida effettuata");
//							}
//							System.out.println(carrello[0]);
//							System.out.println(carrello[1]);
//							System.out.println(carrello[2]);
//							System.out.println(carrello[3]);
//							System.out.println(carrello[4]);
//							System.out.println(somma);
//						} else {
//							System.out.println("Non e' abilitato agli acquisti online");
//						}
//					}
//				}
//				while (uscita != "ESC");
//				scanner.close();
//			}
//		}
}
