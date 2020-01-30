package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public class Polygon {

    protected double[] polygonSides;

    public Polygon(double[] polygonSides) {
        this.polygonSides = polygonSides;
    }

    public double calculatePerimeter(){
        double perimeter = 0.0;
        for(double side : this.polygonSides){
            perimeter += side;
        }
        return perimeter;
    }
}
