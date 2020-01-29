//package it.intersistemi.corsojava.polimorfism.exercises.polygonGenerator;
//
//import it.intersistemi.corsojava.polimorfism.exercises.polygon.Polygon;
//
//import java.util.Random;
//
//public class PolygonFactory {
//
//    private PolygonGenerator[] generators = {
//            new CircleGenerator(),
//            new PentagonGenerator(),
//            new RectangleGenerator(),
//            new SquareGenerator(),
//            new EquilateralTriangleGenerator()
//    };
//
//    public Polygon[] polygonFactory (int howMany){
//        Polygon[] polygons = new Polygon[howMany];
//        Random value = new Random();
//        for(int index = 0; index < polygons.length; index++){
//            polygons[index] = generators[value.nextInt(generators.length)].generatePolygon();
//        }
//        return polygons;
//    }
//}
