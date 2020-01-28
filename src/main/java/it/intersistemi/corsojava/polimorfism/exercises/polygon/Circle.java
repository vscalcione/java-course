package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Circle extends Polygon{

    private double circleRadius;

    public Circle(double[] polygonSides, double circleRadius) {
        super(polygonSides);
        this.circleRadius = circleRadius;
    }

    public Circle(double circleRadius){
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
        return Math.round(2 * Math.PI * this.circleRadius);
    }
}
