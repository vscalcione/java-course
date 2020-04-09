package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStaticVariablesAndClasses {

	public static class Person{
		public static int falseId = 123456789;
		public int id;

		public static int getFalseId() {
			return falseId;
		}

		public static void setFalseId(int falseId) {
			Person.falseId = falseId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}

	public static class StaticTest{
		public static int i = 47;
		public int k = 0;

		public static int getI() {
			return i;
		}

		public static void setI(int i) {
			StaticTest.i = i;
		}

		public int getK() {
			return k;
		}

		public void setK(int k) {
			this.k = k;
		}
	}

	public static class Operations{

		public static int a, b;
		public static int sum(int a, int b) {
			return a + b ;
		}

		public static int difference(int a, int b) {
			return a - b;
		}

		public static int product(int a, int b){
			return a * b;
		}

		public static int quozient(int a, int b){
			if(a == 0 || b == 0){
				return 0;
			}else{
				return a / b;
			}
		}

		public static int rest(int a, int b){
			return a % b;
		}
	}

	public static void useOfVariables(){

		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("P1 - matricola " + p1.falseId + " vera matricola: " + p1.id);
		System.out.println("P2 - matricola " + p2.falseId + " vera matricola: " + p2.id);

		p1.falseId = 12;
		p1.id = 15;
		System.out.println("P1 - matricola " + p1.falseId + " vera matricola: " + p1.id);
		System.out.println("P2 - matricola " + p2.falseId + " vera matricola: " + p2.id);
		p1.falseId++;
		p1.id = 16;
		System.out.println("P1 - matricola " + p1.falseId + " vera matricola: " + p1.id);
		System.out.println("P2 - matricola " + p2.falseId + " vera matricola: " + p2.id);
		p1.falseId = 0;
		System.out.println("P1 - matricola " + p1.falseId + " vera matricola: " + p1.id);
		System.out.println("P2 - matricola " + p2.falseId + " vera matricola: " + p2.id);

		Person p3 = new Person();
		System.out.println("P3 - matricola " + p3.falseId + " vera matricola: " + p3.id);
	}

	public static void useOfStaticVariables(){
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st1.k);
		System.out.println(st2.k);
		StaticTest.i++ ;
		st1.k++ ; st2.k++ ;
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st1.k);
		System.out.println(st2.k);

		// StaticTest rende il valore di classe.
		StaticTest.i++ ;
		st1.k++ ; st2.k++ ;
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st1.k);
		System.out.println(st2.k);
	}

	public static void scientificCalculator() throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Sum\n2. Difference\n3. Product\n4. Quozient\n5. Rest ");
		int choice = ConsoleInputInt.readInt(console, "Insert choice: ");
		int value1 = ConsoleInputInt.readInt(console, "Insert value: ");
		int value2 = ConsoleInputInt.readInt(console, "Insert value: ");
		if (choice < 1 || choice > 5){
			System.out.println("Error");
		}else{
			if (choice == 1){
				System.out.println("Result: " + Operations.sum(value1, value2));
			}
			if(choice == 2){
				System.out.println("Result: " + Operations.difference(value1, value2));
			}
			if(choice == 3){
				System.out.println("Result: " + Operations.product(value1, value2));
			}
			if(choice == 4){
				System.out.println("Result: " + Operations.quozient(value1, value2));
			}
			if(choice == 5){
				System.out.println("Result: " + Operations.rest(value1, value2));
			}
		}
	}

	public static void main(String[] args) throws IOException {
		useOfVariables();
		useOfStaticVariables();
		scientificCalculator();
	}
}
