package it.intersistemi.corsojava.array;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayGeneratorGenerics {

    public static <T> List<T> arrayToList(T[] items){
        List<T> list = new ArrayList<T>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }

    public static <T> T[] listToArray(Class<T> classe, List<T> list) {
        T[] array = (T[]) Array.newInstance(classe, list.size());
        ListIterator<T> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            array[index] = listIterator.next();
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int indexArray = ConsoleInputInt.readInt(console, "How many elements have your array? ");
        String[] arrayString = new String[indexArray];
        for(int i = 0; i < arrayString.length; i++) {
            String item = ConsoleInputString.readString(console, "Element: ");
            arrayString[i] = item;
        }
        List<String> listString = arrayToList(arrayString);
        System.out.println(listString);
        arrayString = listToArray(String.class, listString);
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
