package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto {
	protected int coordinateX, coordinateY;
	public Punto() {}
	
	public Punto(int coordinateX, int coordinateY) {
		this.setXY(coordinateX, coordinateY);
	}
	
	public void setXY(int coordinateX, int coordinateY) {
		this.setCoordinateX(coordinateX);
		this.setCoordinateY(coordinateY);
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	
	public int getCoordinateY() {
		return coordinateY;
	}
	
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	
	public double getDistance(Punto p) {
		int value1 = (coordinateX - p.coordinateX) * (coordinateX - p.coordinateX);
		int value2 = (coordinateY - p.coordinateY) * (coordinateY - p.coordinateY);
		return Math.sqrt(value1 + value2);
	}
	
	public static void main(String[] args) throws IOException{
		int coordinateXpunto1, coordinateYpunto1, coordinateXpunto2, coordinateYpunto2;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		coordinateXpunto1 = ConsoleInputInt.readInt(console, "Insert coordinate: ");
		coordinateYpunto1 = ConsoleInputInt.readInt(console, "Insert coordinate: ");
		coordinateXpunto2 = ConsoleInputInt.readInt(console, "Insert coordinate: ");
		coordinateYpunto2 = ConsoleInputInt.readInt(console, "Insert coordinate: ");
		Punto punto1 = new Punto(coordinateXpunto1, coordinateYpunto1);
		Punto punto2 = new Punto(coordinateXpunto2, coordinateYpunto2);
		double distance = punto1.getDistance(punto2);
		distance = Math.round(distance);
		System.out.println("Distance between punto p1 (" + coordinateXpunto1 + "," + coordinateYpunto1 + ") and punto p2 (" + coordinateXpunto2 + "," +
				coordinateYpunto2 + ") is: " + distance);
	}
}