package it.intersistemi.corsojava.collections;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMainExample {

    public static void main(String[] args) throws IOException {
        List<String> stringList = new ArrayList<String>();
        List<String> linkedList = new ArrayList<String>();
        inizializeStringList(stringList);
        inizializeStringList(linkedList);
        printList(stringList);
        printList(linkedList);
    }

    public static void inizializeStringList(List<String> stringList) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int value = ConsoleInputInt.readInt(console, "How many items do you want to add to your list? ");
        for (int index = 0; index < value; index++){
            String valueString = ConsoleInputString.readString(console, "Insert value: ");
            stringList.add(valueString);
        }
    }

    public static void printList(List<?> list){

        //While iteration
        System.out.println("====================");
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj + " , ");
        }

        //For iteration
        System.out.println("====================");
        iterator = list.iterator();
        for(iterator = list.iterator(); iterator.hasNext();){
            Object obj = iterator.next();
            System.out.println(obj + " ,");
        }

        //For index
        System.out.println("====================");
        for(int index = 0; index < list.size(); index++){
            Object obj = list.get(index);
            System.out.println(index + " : " + obj);
        }

        //Foreach
        System.out.println("====================");
        for(Object obj : list){
            System.out.println(obj + " , ");
        }


        //While list iterator
        System.out.println("====================");
        ListIterator<?> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int index = listIterator.nextIndex();
            Object obj = listIterator.next();
            System.out.println(index + " : " + obj);
        }
    }
}
