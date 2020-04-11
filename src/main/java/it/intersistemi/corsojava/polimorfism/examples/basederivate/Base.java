package it.intersistemi.corsojava.polimorfism.examples.basederivate;

public class Base {

    public boolean compareType(Base other){
        return this.getClass().equals(other.getClass());
    }
}
