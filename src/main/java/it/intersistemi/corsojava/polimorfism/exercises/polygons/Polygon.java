package it.intersistemi.corsojava.polimorfism.exercises.polygons;

public abstract class Polygon implements GenericPolygon {
	protected double[] polygonSides;
	public Polygon(double[] polygonSides) {
		super();
		this.polygonSides = polygonSides;
	}

	public int getSidesNumber() {
		return this.polygonSides.length;
	}

	public double calculatePerimeter() {
		double perimeter = 0.0;
		for (double side : polygonSides) {
			perimeter += side;
		}
		return perimeter;
	}

	public abstract double calculateArea();
}
