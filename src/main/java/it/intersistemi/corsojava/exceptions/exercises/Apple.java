package it.intersistemi.corsojava.exceptions.exercises;

public class Apple extends Fruit{
    public Apple(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple [getWeight() = " + getWeight() + ", toString()= " + super.toString() + ", getClass()=" + getClass() + ", hashCode() = " + hashCode() + "] ";
    }
}
