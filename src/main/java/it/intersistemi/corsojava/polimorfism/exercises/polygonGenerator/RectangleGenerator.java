package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;

import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
import it.intersistemi.corsojava.polimorfism.exercises.polygon.Rectangle;

import java.util.Arrays;
import java.util.Random;

public class RectangleGenerator extends PolygonGenerator {

    @Override
    public Rectangle[] generatePolygon(int howMany) {
        Polygon[] generatePolygon = super.generatePolygon(howMany);
        return Arrays.copyOf(generatePolygon, generatePolygon.length, Rectangle[].class);
    }

    @Override
    public Rectangle generatePolygon() {
        Random rnd = new Random();
        return new Rectangle(rnd.nextInt(50), rnd.nextInt(50));
    }
}
