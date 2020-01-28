package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Triangle extends Polygon{

    protected double triangleSide;

    public Triangle(double triangleSide) {
        super(new double[]{});
        this.triangleSide = triangleSide;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(3 * this.triangleSide);
    }
}
