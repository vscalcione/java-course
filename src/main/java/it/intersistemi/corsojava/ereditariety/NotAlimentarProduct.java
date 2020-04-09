package it.intersistemi.corsojava.ereditariety;

public class NotAlimentarProduct extends MarketProduct {

    String principalMaterial;

    public NotAlimentarProduct(String name, int barCode, String description, double price, String principalMaterial) {
        super(name, barCode, description, price);
        this.principalMaterial = principalMaterial;
    }

    public String getPrincipalMaterial() {
        return principalMaterial;
    }

    public void setPrincipalMaterial(String principalMaterial) {
        this.principalMaterial = principalMaterial;
    }

    public double applyDiscount() {
        double newPrice;
        if (principalMaterial.equals("paper") || principalMaterial.equals("plastica") || principalMaterial.equals("legno")) {
            newPrice = this.getPrice() - this.getPrice() * 0.10;
            return newPrice;
        } else {
            newPrice = this.getPrice() - this.getPrice() * 0.05;
            return newPrice;
        }
    }

    @Override
    public String toString() {
        return "NotAlimentarProduct{" +
                "principalMaterial='" + principalMaterial + '\'' +
                '}';
    }

    public static void main(String[] args) {
		NotAlimentarProduct prodotto1 = new NotAlimentarProduct("Calzini", 1704294223, "Maschili", 2.2, "plastica");
		NotAlimentarProduct prodotto2 = new NotAlimentarProduct("Calzini new", 1704294223, "Maschili", 2.2, "cotone");
		System.out.println(prodotto1);
		System.out.println(prodotto2);
		NotAlimentarProduct markerProduct = prodotto2;
		double newPrice = prodotto2.applyDiscount();
		markerProduct.setPrice(newPrice);
		System.out.println(newPrice);
		System.out.println(markerProduct);
	}
}
