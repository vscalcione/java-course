//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.*;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class EquilateralTriangleGenerator extends PolygonGenerator{
//
//    @Override
//    public Circle generatePolygon() {
//        Random randomValue = new Random();
//        return new Rectangle(randomValue.nextInt(50) ,randomValue.nextInt(50));
//    }
//
//    @Override
//    public Polygon[] generatePolygon(int howMany) {
//        Polygon[] generatePolygon = super.generatePolygon(howMany);
//        return Arrays.copyOf(generatePolygon, generatePolygon.length, EquilateralTriangle[].class);
//    }
//}
