package it.intersistemi.corsojava.polimorfism.examples.abc;

public class C implements B1,B2{

    @Override
    public String getItem() {
        return B1.super.getItem() + " - " + B2.super.getItem() + ". But in reality I am C ";
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getItem());
    }
}
