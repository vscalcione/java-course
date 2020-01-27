package it.intersistemi.corsojava.polimorfism.exercises.polygons;

public class TriangoloEquilatero extends Triangolo implements PoligonoRegolare {
	protected double lato;
	public TriangoloEquilatero(double lato) {
		super(lato, lato, lato);
	}

	@Override
	public double getLato() {
		return super.latiPoligono[0];
	}

	@Override
	public double calcolaArea() {
		return PoligonoRegolare.super.calcolaArea();
	}
}
