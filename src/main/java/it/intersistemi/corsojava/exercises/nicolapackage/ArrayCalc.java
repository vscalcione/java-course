package it.intersistemi.corsojava.exercises.nicolapackage;

public class ArrayCalc {
	
	public int prodottoScalare (Array a, Array b) {
		int p = 0;
		for (int i = 0; i < a.getSize(); i++) {
			p = p+a.get(i)*b.get(i);
		}
		return p;
	}
	
	public Array somma(Array a, Array b) {
		
		Array c = new Array(a.getSize());
		for (int i = 0; i < a.getSize(); i++) {
			//c[i] = a[i] + b[i];
			c.set(a.get(i)+b.get(i), i);
		}
	
		return c;
		
	}

}
