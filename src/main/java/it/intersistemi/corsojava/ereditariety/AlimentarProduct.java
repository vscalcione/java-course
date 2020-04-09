package it.intersistemi.corsojava.ereditariety;

import it.intersistemi.corsojava.lambdaexpressions.exercises.library.Data;

public class AlimentarProduct extends MarketProduct {

    Data date;

    public AlimentarProduct(String name, int barCode, String description, double price, Data date) {
        super(name, barCode, description, price);
        this.date = date;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public double applyDiscount() {
        return (this.getPrice() - this.getPrice() * 0.20);
    }

    @Override
    public String toString() {
        return "AlimentarProduct {" +
                "name=" + MarketProduct.name + ", " +
                "barcode=" + MarketProduct.barCode + ", " +
                "description=" + MarketProduct.description + ", " +
                "date=" + date +
                '}';
    }

    public static void main(String[] args) {
		Data actualDate = new Data(11, 11, 2017);
		AlimentarProduct product1 = new AlimentarProduct("Salame", 1704217702, "Fatto in casa", 3.4, new Data(12, 11, 2017)); //non mi prende questa assegnazione
		AlimentarProduct product2 = new AlimentarProduct("Salame new", 1704217703, "Fatto in Casa", 3.4, new Data(19, 12, 2017));
		System.out.println(product1);// per avere tutti i dati ho bisogni di implementare toString anche nella sottoclasse
		System.out.println(product2);
		Data date = product1.date;
		int result = actualDate.getDifference(date);
		if (result < 10) {
			AlimentarProduct marketProduct = product2;
			double newPrice = product2.applyDiscount();
			marketProduct.setPrice(newPrice); // con il set (risposta a riga precedente)
			System.out.println("Price of product2: " + newPrice);
			System.out.println(marketProduct);
		}
		System.out.println(result);
		System.out.println(product1.getDate());
	}
}
