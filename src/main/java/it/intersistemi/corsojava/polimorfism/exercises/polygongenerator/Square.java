package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class Square extends Polygon {
	protected double squareSide;
	public Square(double squareSide) {
		super(new double[] {});
		this.squareSide = squareSide;
	}
	
	@Override
	public double calculatePerimeter() {
		return 4 * this.squareSide;
	}	
}

