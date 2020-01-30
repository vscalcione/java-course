package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public abstract class AbstractTriangle extends AbstractPolygon{

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    public AbstractTriangle (double firstSide, double secondSide, double thirdSide) {
        super(new double[]{
                firstSide,
                secondSide,
                thirdSide
        });
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
}
