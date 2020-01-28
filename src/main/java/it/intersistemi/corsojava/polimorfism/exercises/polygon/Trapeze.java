package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Trapeze extends Polygon{

    protected double majorBase;
    protected double minorBase;
    protected double side;

    public Trapeze(double majorBase, double minorBase, double side) {
        super(new double[]{});
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.side = side;
    }

    public double getMajorBase() {
        return majorBase;
    }

    public void setMajorBase(double majorBase) {
        this.majorBase = majorBase;
    }

    public double getMinorBase() {
        return minorBase;
    }

    public void setMinorBase(double minorBase) {
        this.minorBase = minorBase;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return ((this.majorBase + this.minorBase ) + (this.side * 2));
    }
}
