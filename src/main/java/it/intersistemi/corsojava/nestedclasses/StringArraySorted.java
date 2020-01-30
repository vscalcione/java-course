package it.intersistemi.corsojava.nestedclasses;

import java.util.Arrays;
import java.util.Comparator;

public class StringArraySorted {

    public static void main(String[] args) {
        String[] stringArray = {"aa","bbb","cccc","yyyyy","rrrrrr","zzzzzzz"};
        System.out.println("\n Original array: ");
        printArray(stringArray);
        Arrays.sort(stringArray);
        System.out.println("\n Alfabetic Sorted Array ");
        printArray(stringArray);
        System.out.println("\n 2nd Sorting type");
        Arrays.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        printArray(stringArray);
        System.out.println("\n 3rd Sorting type");
        Arrays.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        printArray(stringArray);


    }

    public static void printArray(String[] arrayString){
        System.out.println("=========================================");
        for (int index = 0; index < arrayString.length; index++) {
            System.out.print(arrayString[index]+" , ");
        }

        System.out.println("\n=========================================");
    }
}
