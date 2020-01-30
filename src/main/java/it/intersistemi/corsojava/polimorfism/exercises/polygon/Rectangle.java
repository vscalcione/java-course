package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Rectangle extends Polygon{

    protected double majorBase;
    protected double minorBase;

    public Rectangle(double majorBase, double minorBase) {
        super(new double[]{});
        this.majorBase = majorBase;
        this.minorBase = minorBase;
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

    @Override
    public double calculatePerimeter() {
        return ((this.majorBase + this.minorBase) * 2);
    }
}
