package it.intersistemi.corsojava.polimorfism.exercises.polygons;

public class Pentagono extends Polygon implements PoligonoRegolare {
	public Pentagono(double lato) {
		super(new double[] { lato, lato, lato, lato, lato });
	}

	@Override
	public double getLato() {
		return super.latiPoligono[0];
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
