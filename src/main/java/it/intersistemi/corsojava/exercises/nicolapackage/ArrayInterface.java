package it.intersistemi.corsojava.exercises.nicolapackage;

public interface ArrayInterface {
	
	int max();
	double average();
	void print();
	int get(int i);
	void set(int valore, int i);
	int search(int elemento) throws ElementNotFound, OutOfRangeElement;
	int getSize();
	double norma();
	void load();
	void save();

}
