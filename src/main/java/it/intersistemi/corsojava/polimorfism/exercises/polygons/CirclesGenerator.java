package it.intersistemi.corsojava.polimorfism.exercises.polygons;

import it.intersistemi.corsojava.generatorepoligoni.GeneratorePoligoni;

import java.util.Random;

public class CirclesGenerator extends GeneratorePoligoni{
	@Override
	public Polygon generaPoligono(){
		Random rnd=new Random();
		return new Circle(rnd.nextInt(50));
	}
}
