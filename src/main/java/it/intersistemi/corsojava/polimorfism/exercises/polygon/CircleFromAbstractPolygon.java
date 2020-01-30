package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class CircleFromAbstractPolygon extends AbstractPolygon{

    private double circleRadius;

    public CircleFromAbstractPolygon(double circleRadius) {
        super(new double[]{});
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * this.circleRadius);
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(this.circleRadius, 2));
    }

    @Override
    public double getSidesNumber() {
        return 0;
    }
}
