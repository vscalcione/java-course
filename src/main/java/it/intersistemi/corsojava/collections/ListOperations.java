package it.intersistemi.corsojava.collections;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) throws IOException {

        List<String> list1 = new ArrayList<String>();
        generateList(list1);
        List<String> list2 = new ArrayList<String>();
        generateList(list2);
        List<String> list = null;
        list = new ArrayList<>(list1);
        list.addAll(list2);
        System.out.println("List.addAll(list2): " + list);
        list = new ArrayList<>(list1);
        list.removeAll(list2);
        System.out.println("List.removeAll(list2): " + list);
        list = new ArrayList<>(list1);

        //the retainAll method (Collection <?> c) ​​allows you to extract the data present in 2 different collections
        list.retainAll(list2);
        System.out.println("List.retainAll(list2) : " + list);
    }

    public static void generateList(List<String> list) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int elementsList = ConsoleInputInt.readInt(console, "How many items do you want your list to have? ");
        for (int index = 0; index < elementsList; index++) {
            String item = ConsoleInputString.readString(console, "Insert value: ");
            list.add(item);
        }
    }
}
