package it.intersistemi.corsojava.exercises.nicolapackage;

import java.util.InputMismatchException;
import java.util.Scanner;

// test di Array e ArrayCalc con menu testuale
public class TestMenu {
	
	private final static int dim = 10;
	private final static int ESCI = 7;
	
	public static void main(String args[]) {
		// inizializza gli oggetti e stampa l'array
		ArrayCalc calc = new ArrayCalc();
		Array a = new Array(dim);
		System.out.println("Array iniziale: ");
		a.print();
        
		int scelta = 0;
		
		Scanner s = new Scanner(System.in);
		//s.useDelimiter("\\s*\n\\s*");
		
		while (scelta!=ESCI) {
			scelta = menu(s);
			if (scelta <=0 && scelta>7) 
				continue;
			
			switch(scelta) {
				case 1:
					a = new Array(dim);
					System.out.println("Array aggiornato: ");
					a.print();
				case 2:
					System.out.println("La norma è: "+a.norma());
					break;
				case 3:
					System.out.println("La media è: "+a.average());
					break;
				case 4:
					Array b = new Array(dim);
					System.out.println("Secondo array generato: ");
					b.print();
					System.out.println("La somma è: ");
					calc.somma(a,b).print();
					break;
				case 5:
					b = new Array(dim);
					System.out.println("Secondo array generato: ");
					b.print();
					System.out.println("Il prodotto scalare è: "+calc.prodottoScalare(a, b));
					break;
				case 6:
					try {
						System.out.print("Inserisci elemento da cercare: ");
						int elemento = s.nextInt();
						int i = a.search(elemento);
					    System.out.println("Elemento "+elemento+ " trovato in posizione: "+i);
					} catch (InputMismatchException e) {
						System.out.println("ATTENZIONE: il valore deve essere intero");
						s.next(); // next a vuoto per rimuovere il valore errato dal canale di input
					} catch (ElementNotFound | OutOfRangeElement e) {
						System.out.println(e.getMessage());
					}
					break;
				case ESCI:
					System.out.println("Arrivederci");
					break;		
				
			} // end switch
			
		} //end while
		s.close();
	
	} //end main
	
	// metodo di utilità per presentare il menu
	private static int menu(Scanner s) {
		System.out.println("\n-----MENU-----");
		System.out.println("Cosa vuoi fare?");
		System.out.println("\t1) genera array");
		System.out.println("\t2) calcolo norma");
		System.out.println("\t3) calcolo media");
		System.out.println("\t4) somma array");
		System.out.println("\t5) prodotto scalare");
		System.out.println("\t6) ricerca elemento");
		System.out.println("\t7) esci");
		System.out.println("Scelta: ");
		return s.nextInt(); 
	
	}
	
	

}
