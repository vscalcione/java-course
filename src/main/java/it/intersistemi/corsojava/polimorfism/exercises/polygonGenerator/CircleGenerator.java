//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Circle;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class CircleGenerator extends PolygonGenerator{
//
//    @Override
//    public Polygon[] generatePolygon(int howMany) {
//        Polygon[] generatePolygon = super.generatePolygon(howMany);
//        return Arrays.copyOf(generatePolygon, generatePolygon.length, Circle[].class);
//    }
//
//    @Override
//    public Circle generatePolygon() {
//        Random rndValue = new Random();
//        return new Circle(rndValue.nextInt(50));
//    }
//}
