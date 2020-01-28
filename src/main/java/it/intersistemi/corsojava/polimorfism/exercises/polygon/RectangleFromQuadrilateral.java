package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class RectangleFromQuadrilateral extends Quadrilateral{

    public RectangleFromQuadrilateral(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super(firstSide, secondSide, thirdSide, fourthSide);
    }

    public RectangleFromQuadrilateral(double majorBase, double minorBase){
        super(majorBase, majorBase, minorBase, minorBase);
    }

    @Override
    public double calculateArea() {
        return super.polygonSides[0] * super.polygonSides[1];
    }

    @Override
    public double getSidesNumber() {
        return 0;
    }
}