package it.intersistemi.corsojava.collections;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {

    public static void main(String[] args) throws IOException {
        Set<String> listNames = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare1 = o1.compareToIgnoreCase(o2);
                if(compare1 == 0) {
                    return o2.compareTo(o1);
                }
                return compare1;
            }
        });
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int elementsList = ConsoleInputInt.readInt(console, "How many items do you want your list to have? ");
        for (int i = 0; i < elementsList; i++) {
            String item = ConsoleInputString.readString(console, "Insert value: ");
            listNames.add(item);
        }
        printList(listNames);
    }

    public static void printList(Set<String> listNames) {
        Iterator<String> listNamesIterator = listNames.iterator();
        while(listNamesIterator.hasNext()) {
            String name = listNamesIterator.next();
            System.out.print(name + " , ");
        }
    }
}