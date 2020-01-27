package it.intersistemi.corsojava.polimorfism.exercises.polygongenerator;

public class PolygonGeneratorMain {

	public static void main(String[] args) {
		double result;

		//Circle
		Circle circle = new Circle(10);
		System.out.println("Creating a new object type circle");
		result = circle.calculatePerimeter();
		System.out.println("Circle perimeter: " + result + " cm ");

		//Triangle
		Triangle triangle = new Triangle(7);
		System.out.println("Creating a new object type triangle ");
		result = triangle.calculatePerimeter();
		System.out.println("Triangle perimeter: " + result + " cm ");

		//Square
		Square square = new Square(26);
		System.out.println("Creating a new object type square");
		result = triangle.calculatePerimeter();
		System.out.println("Square perimeter: " + result + " cm ");

		//Rectangle
		Rectangle rectangle = new Rectangle(10,5);
		System.out.println("Creating a new object type Rectangle");
		result = rectangle.calculatePerimeter();
		System.out.println("Rectangle perimeter: " + result + " cm ");

		//Trapeze
		Trapeze trapeze = new Trapeze(7,4,3.2);
		System.out.println("Creating a new object type trapeze");
		result = trapeze.calculatePerimeter();
		System.out.println("Trapeze perimeter: " + result + " cm ");

	}
}