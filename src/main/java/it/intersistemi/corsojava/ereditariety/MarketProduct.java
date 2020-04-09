package it.intersistemi.corsojava.ereditariety;

import java.io.IOException;

/*ESERCIZIO 2
Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari .
 Ai prodotti Alimentari viene infatti associata una data di scadenza (si veda la classe Data), mentre a quelli Non Alimentari il materiale principale di cui sono fatti. 
 Realizzare le sottoclassi Alimentari e NonAlimentari estendendo opportunamente la classe Prodotto.

ESERCIZIO 3
Modificare le due sottoclassi dell'esercizio 2 specializzando il metodo applicaSconto in modo che nel 
caso dei prodotti Alimentari venga applicato uno sconto del 20% se la data di scadenza � a meno di 10 giorni 
dalla data attuale (si usi il metodo getDifference della classe Data), mentre nel caso dei prodotti Non Alimentari
 venga applicato uno sconto del 10% se il prodotto � composto da un materiale riciclabile (carta, vetro o plastica).

ESERCIZIO 4
Realizzare una classe ListaSpesa che chieda all'utente di inserire i prodotti acquistati e 
calcoli il totale della spesa applicando gli opportuni sconti se il cliente ha la tessera fedelt�.
*/
public class MarketProduct {

	public static String name;
	public static int barCode;
	public static String description;
	public static double price;

	public MarketProduct(String name, int barCode, String description, double price) {
		this.name = name;
		this.barCode = barCode;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double applyDiscount() {
		return (this.getPrice() - this.getPrice() * 0.05);
	}

	@Override
	public String toString() {
		return "MarketProduct{" +
				"name='" + name + '\'' +
				", barCode=" + barCode +
				", description='" + description + '\'' +
				", price=" + price +
				'}';
	}

	public static void main(String[] args) throws IOException {
		MarketProduct product1 = new MarketProduct("Birra Lager", 1704294702, "Artigianale", 4.0);
		MarketProduct product2 = new MarketProduct("Calzini", 1704294223, "Maschili", 2.2);
		MarketProduct product3 = new MarketProduct("Salame", 1704217702, "Fatto in casa", 3.4);
		MarketProduct product4 = new MarketProduct("Padella", 1723294702, "Inox", 12.4);
		System.out.println(product1);// valide entrambe le notazioni
		System.out.println(product2.toString()); // valide entrambe le notazioni
		System.out.println(product3.toString());
		System.out.println(product4.toString());
		MarketProduct marketProduct = product3;
		double newPrice = product3.applyDiscount(); // nel metodo ho inserito che va a prendersi il prezzo
		marketProduct.setPrice(newPrice); // con il set (risposta a riga precedente)
		System.out.println(newPrice);
		System.out.println(marketProduct);
	}
}
