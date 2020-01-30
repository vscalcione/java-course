package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public abstract class Quadrilateral extends AbstractPolygon{

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;

    public Quadrilateral(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(new double[]{firstSide, secondSide, thirdSide, fourthSide});
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

    public double getFourthSide() {
        return fourthSide;
    }

    public void setFourthSide(double fourthSide) {
        this.fourthSide = fourthSide;
    }
}
