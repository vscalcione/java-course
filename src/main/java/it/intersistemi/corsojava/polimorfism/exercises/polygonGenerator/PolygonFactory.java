package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;

public class PolygonFactory {

    private PolygonGenerator[] generators = {
            new CircleGenerator(),
            new PentagonGenerator(),
    }
}
