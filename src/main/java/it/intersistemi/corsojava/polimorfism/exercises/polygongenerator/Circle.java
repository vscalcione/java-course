package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class Circle extends Polygon {
	private double circleRadius;
	public Circle(double circleRadius) {
		super(new double[] {});
		this.circleRadius = circleRadius;
	}

	@Override
	public double calculatePerimeter() {
		return Math.round(2 * Math.PI *  this.circleRadius);
	}
}