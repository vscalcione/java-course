package it.intersistemi.corsojava.array;
import java.util.Random;

public class RandomValuesArray {
	public static void main(String[] args) {
		System.out.println("********** Obtained result: *************** ");
		generatorePseudoArrayRandomValoriPari();
	}
	
	public static void generatorePseudoArrayRandomValoriPari() {
		Random randomValue = new Random();
		int tmp = 0;
		int[] randomArray = new int[15];
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = randomValue.nextInt(50);
			if(randomArray[i] != 0 && randomArray[i] %2 == 0) {
				tmp += randomArray[i];
				System.out.print(randomArray[i]+ " |");
			}
		}
	}
}
