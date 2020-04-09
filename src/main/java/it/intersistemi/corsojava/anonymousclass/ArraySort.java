package it.intersistemi.corsojava.anonymousclass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        sortingArray();
    }

    public static void printArray(String[] arrayString){
        for (String element : arrayString) {
            System.out.println(element);
        }
    }
    public static void sortingArray(){
        String[] arrayString = new String[]{"aaaaa", "ddddddd", "ooooo", "bbbbbb", "lllll", "mmmmmmm"};
        System.out.println("Ordino l'array ");
        printArray(arrayString);
        System.out.println("Altro tipo di ordinamento ");
        Arrays.sort(arrayString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

            /**
             *  con l'istruzione o1.compareTo(o2) si ottiene la comparazione in ordine alfabetico,
             *  ma moltiplicando per -1, si ottiene l'ordinamento inverso
             */
//            return -1 * o1.compareTo(o2);

            /**
             *  con la seguenre istruzione, invece, si ottiene l'ordinamento in base alle lunghezze della stringa analizzata
             */
//            return o1.length() - o2.length()

        });
        printArray(arrayString);
    }
}
