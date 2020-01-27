package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class Trapeze extends Polygon {
	protected double majorBase, minorBase, side;
	public Trapeze(double majorBase, double minorBase, double side) {
		super(new double[] {});
		this.majorBase = majorBase;
		this.minorBase = minorBase;
		this.side = side;
	}
	
	@Override
	public double calculatePerimeter() {
		return ((this.majorBase + this.minorBase) * (this.side * 2));
	}
}
