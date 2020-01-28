//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Rectangle;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Square;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class SquareGenerator extends PolygonGenerator{
//
//    @Override
//    public Square[] generatePolygon(int howMany) {
//        Polygon[] generatePolygon = super.generatePolygon(howMany);
//        return Arrays.copyOf(generatePolygon, generatePolygon.length, Square[].class);
//    }
//
//    @Override
//    public Rectangle generatePolygon() {
//        Random rndValue = new Random();
//        return new Square(rndValue.nextInt(50));
//    }
//}
//
