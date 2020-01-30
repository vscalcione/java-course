package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public interface RegularPolygon {

    public default double calculateApotema(){
        return Math.round(getSide() / (Math.round(Math.PI / getSidesNumber())));
    }

    public default double calculateArea(){
        return ((calculatePerimeter() + calculateApotema()) / 2);
    }

    public double calculatePerimeter();
    public double getSide();
    public double getSidesNumber();
}
