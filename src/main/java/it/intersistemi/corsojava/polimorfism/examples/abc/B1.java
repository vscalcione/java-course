package it.intersistemi.corsojava.polimorfism.examples.abc;

public interface B1 extends A{

    @Override
    default String getItem() {
        return "I am B";
    }
}
