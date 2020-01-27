package it.intersistemi.corsojava.polimorfism.examples;

public class BaseDerivateMain {
    public static void main(String[] args) {
        Base base1 = new Base();
        Base base2 = new Base();
        Derivate derivate = new Derivate();

        System.out.println("base1.compareType(base2): " + base1.compareType(base2));
        System.out.println("base1.compareType(derivate): " + base1.compareType(derivate));
        System.out.println("base2.compareType(base1): " + base2.compareType(base1));
        System.out.println("base2.compareType(derivate): " + base2.compareType(derivate));

    }
}

