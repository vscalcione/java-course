package it.intersistemi.corsojava.exercises.nicolapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Array implements ArrayInterface {

	private int array[];
	private int size;
	
	public Array(int s) {
		size = s;
		array = new int[size];
		Random value = new Random();
		for (int index = 0; index < size; index++)
			array[index] = value.nextInt(50) + 1;
	}

	@Override
	public int max() {
		int max = 0;
		for(int index = 0; index < size; index++){
			if(array[index] > max)
				max = array[index];
		}
		return max;
	}

	@Override
	public double average() {
		double sum = 0;
		for(int index = 0; index < size; index++)
			sum = sum + array[index];
		return sum / size;
	}

	@Override
	public void print() {
		for(int index = 0; index < size; index++){
			System.out.println(array[index]);
		}
	}

	@Override
	public int get(int index) {
		return array[index];
	}

	@Override
	public void set(int value, int index) {

	}

	@Override
	public int search(int element) throws ElementNotFound, OutOfRangeElement {
		if(element < 1 || element > 50) {
			throw new OutOfRangeElement("Element" + element + " out of range ");
		}
		boolean found = false;
		int index = 0;
		while(!found && index < size){
			if(array[index] == element){
				found = true;
			}else{
				index++;
			}
		}
		if(index == size){
			throw new ElementNotFound("Element " + element + " not found ");
		}else{
			return index;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public double norma() {
		return 0;
	}

	@Override
	public void load() {

	}

	@Override
	public void save() {

	}
}
