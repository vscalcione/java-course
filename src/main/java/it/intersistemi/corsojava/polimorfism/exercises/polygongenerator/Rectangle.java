package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class Rectangle extends Polygon {
	protected double majorBase, minorBase;
	public Rectangle(double majorBase, double minorBase) {
		super(new double[] {});
		this.majorBase = majorBase;
		this.minorBase = minorBase;
	}
	
	@Override
	public double calculatePerimeter() {
		return (this.majorBase + this.minorBase) * 2;
	}
}
