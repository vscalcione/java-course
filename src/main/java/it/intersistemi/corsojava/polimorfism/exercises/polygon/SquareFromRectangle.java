package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class SquareFromRectangle extends Rectangle implements RegularPolygon{

    public SquareFromRectangle(double sides) {
        super(sides, sides);
    }

    @Override
    public double calculateApotema() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double getSidesNumber() {
        return 0;
    }

    @Override
    public double getSide() {
        return super.polygonSides[0];
    }
}
