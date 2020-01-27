package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class Polygon {
	protected double[] polygonSides;
	public Polygon(double[] polygonSide) {
		this.polygonSides = polygonSide;
	}

	public double calculatePerimeter() {
		double perimeter = 0.0;
		for(double side : this.polygonSides) {
			perimeter += side;
		}
		return perimeter;
	}
}