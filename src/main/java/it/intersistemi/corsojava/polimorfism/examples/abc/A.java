package it.intersistemi.corsojava.polimorfism.examples.abc;

public interface A {

    default String getItem(){
        return "I am A";
    }
}
