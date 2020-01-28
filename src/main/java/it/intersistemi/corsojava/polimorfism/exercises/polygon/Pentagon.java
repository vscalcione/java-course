package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Pentagon extends AbstractPolygon implements RegularPolygon{

    public Pentagon(double side) {
        super(new double[]{side, side, side, side});
    }

    @Override
    public double getSidesNumber() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double getSide() {
        return super.polygonSides[0];
    }
}