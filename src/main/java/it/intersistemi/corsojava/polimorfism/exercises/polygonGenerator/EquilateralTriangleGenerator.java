//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.EquilateralTriangle;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Rectangle;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class EquilateralTriangleGenerator extends PolygonGenerator{
//
//    @Override
//    public Rectangle generatePolygon() {
//        Random randomValue = new Random();
//        return new EquilateralTriangle(randomValue.nextInt(50));
//    }
//
//    @Override
//    public EquilateralTriangle[] generatePolygon(int howMany) {
//        Polygon[] generatePolygon = super.generatePolygon(howMany);
//        return Arrays.copyOf(generatePolygon, generatePolygon.length, EquilateralTriangle[].class);
//    }
//}
