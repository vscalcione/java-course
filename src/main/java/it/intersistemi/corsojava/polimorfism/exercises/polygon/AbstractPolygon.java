package it.intersistemi.corsojava.polimorfism.exercises.polygon;

public abstract class AbstractPolygon implements GenericPolygon{

    protected double [] polygonSides;

    public AbstractPolygon(double[] polygonSides) {
        super();
        this.polygonSides = polygonSides;
    }

    public double[] getPolygonSides() {
        return polygonSides;
    }

    public void setPolygonSides(double[] polygonSides) {
        this.polygonSides = polygonSides;
    }

    public double calculatePerimeter(){
        double perimeter = 0.0;
        for(double side : this.polygonSides){
            perimeter += side;
        }
        return perimeter;
    }

    public abstract double calculateArea();
}
