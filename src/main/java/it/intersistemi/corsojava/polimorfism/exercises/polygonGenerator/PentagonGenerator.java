//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Circle;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Pentagon;
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class PentagonGenerator extends PolygonGenerator{
//
//    @Override
//    public Polygon[] generatePolygon(int howMany){
//        Pentagon[] generatePolygon = super.generatePolygon(howMany);
//        return Arrays.copyOf(generatePolygon, generatePolygon.length, Pentagon[].class);
//    }
//
//    @Override
//    public Circle generatePolygon() {
//        Random value = new Random();
//        return new Pentagon(value.nextInt(50));
//    }
//}
