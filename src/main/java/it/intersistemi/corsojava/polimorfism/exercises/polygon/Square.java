package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Square extends Polygon{

    protected double squareSide;

    public Square (double squareSide) {
        super(new double[]{});
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.squareSide;
    }
}
