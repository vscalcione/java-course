package it.intersistemi.corsojava.polimorfism.exercises.polygons;

public class Circle extends Polygon {
	private double circleRadius;

	public Circle(double circleRadius) {
		super(new double[] {});
		this.circleRadius = circleRadius;
	}

	public double getCircleRadius() {
		return circleRadius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * this.circleRadius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.circleRadius * this.circleRadius;
	}
}
