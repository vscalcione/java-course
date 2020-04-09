package it.intersistemi.corsojava.exercises.nicolapackage;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ciao");
		list.add("pippo");
		list.add("ciro");
		list.add("pluto");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		
		// ciclo for each con iteratore
		for (String s : list) {
			System.out.println(s);
		}

	}

}
