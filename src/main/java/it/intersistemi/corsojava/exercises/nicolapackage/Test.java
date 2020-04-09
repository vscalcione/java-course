package it.intersistemi.corsojava.exercises.nicolapackage;

public class Test {
	
	final static int dim = 10;

	public static void main(String[] args) {
		
		Array a = new Array(dim);
		
		a.load();
		
		System.out.println("Il contenuto dell'array a è:");
		a.print();
		
		System.out.println("Il valore del massimo è: "+a.max());
		
		System.out.println("La media è: " + a.average());
		
		//a.salva();
		
		/*Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il valore da cercare: ");
		int elemento;
		try {
			elemento = s.nextInt();
			int i = a.cerca(elemento);
		    System.out.println("Elemento "+elemento+ " trovato in posizione: "+i);
		} catch (InputMismatchException e) {
			System.out.println("ATTENZIONE: il valore deve essere intero");
		} catch (ElementoNonTrovato|ElementoFuoriRange e) {
			System.out.println(e.getMessage());
		}*/
		/*
		ArrayCalc calc = new ArrayCalc();
				
		// crea un nuovo array b
		Array b = new Array(dim);
		System.out.println("Il contenuto dell'array b è:");
		b.stampa();
		// calcola il massimo di b
		// confronta il massimo di b con il massimo di a
		// stampa a video l'array con il massimo maggiore
		//if (a.massimo()>b.massimo()) a.stampa();
		//else b.stampa();
		
		System.out.println("La norma di b è: "+b.norma());
		
		Array c = calc.somma(a, b);
		System.out.println("La somma è: ");
		c.stampa();
		System.out.println("La norma della somma è: "+c.norma());
		System.out.println("Il prodotto scalare è: "+calc.prodottoScalare(a, b));
				
		*/
	}

}
