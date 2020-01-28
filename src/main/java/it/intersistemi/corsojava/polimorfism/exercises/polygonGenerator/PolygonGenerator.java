package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;

import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
import it.intersistemi.corsojava.polimorfism.exercises.polygon.Rectangle;

import java.util.Random;

public abstract class PolygonGenerator {

    Random value = new Random();
    double val = value.nextDouble();

    public Polygon[] generatePolygon(int howMany){
        Polygon[] polygons = new Polygon[howMany];
        for(int index = 0; index < polygons.length; index++){
            polygons[index] = this.generatePolygon();
        }
        return polygons;
    }

    public abstract Rectangle generatePolygon();
}
