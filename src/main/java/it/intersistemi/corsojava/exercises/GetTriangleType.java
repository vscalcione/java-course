package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetTriangleType {
	public static void main(String[] args) throws IOException{
		getTypeTriangle();
	}
	public static void getTypeTriangle() throws IOException {
		int firstSide, secondSide, thirdSide;
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		firstSide = ConsoleInputInt.readInt(console, "Primo Lato: ");
		secondSide = ConsoleInputInt.readInt(console, "Secondo lato: ");
		thirdSide = ConsoleInputInt.readInt(console, "Terzo lato: ");
		boolean isScaleneTriangle, isEquilateralTriangle, isIscoscelesTriangle;
		if(firstSide == secondSide && firstSide == thirdSide) {
			isEquilateralTriangle = true;
			System.out.println("Triangle type: equilateral");
		}else if(firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
			isIscoscelesTriangle = true;
			System.out.println("Triangle type: isosceles ");
		}else {
			isScaleneTriangle = true;
			System.out.println("Triangle type: scalene ");
		}
	}
}