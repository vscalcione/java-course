package it.intersistemi.corsojava.polimorfism.exercises.polygons;

public class Quadrato extends Rettangolo implements PoligonoRegolare {
	public Quadrato(double lato) {
		super(lato, lato);
	}

	@Override
	public double getLato() {
		return super.latiPoligono[0];
	}
}
