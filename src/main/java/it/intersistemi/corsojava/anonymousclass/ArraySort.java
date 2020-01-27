package it.intersistemi.corsojava.anonymousclass;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        printArray();
    }

    public static void printArray(){
        String[] arrayString = new String[]{"aaaaa", "ddddddd", "ooooo", "bbbbbb", "lllll", "mmmmmmm"};
        Arrays.sort(arrayString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String element : arrayString) {
            System.out.println(element);
        }
    }
}
