package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class EquilateralTriangle extends Triangle implements RegularPolygon{

    protected double side;

    public EquilateralTriangle(double triangleSide, double side) {
        super(triangleSide);
        this.side = side;
    }

    @Override
    public double calculateApotema() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return RegularPolygon.super.calculateArea();
    }

    @Override
    public double getSide() {
        return super.polygonSides[0];
    }

    @Override
    public double getSidesNumber() {
        return 0;
    }
}
