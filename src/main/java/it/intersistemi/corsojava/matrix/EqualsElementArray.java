package it.intersistemi.corsojava.matrix;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class EqualsElementArray {

    public static int[] generateArray(int lengthArray) {
        Random rndValue = new Random();
        int array[] = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = rndValue.nextInt(90) + 1;
        }
        return array;
    }

    public static boolean verifyArray(int array1[], int array2[]) {
        for(int i = 0; i < array1.length; i++) {
            for(int j = i + 1; j < array2.length; j++) {
                if(array1[i] == array2[i]) {
                    System.out.println("["+array2[i]+"]");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int lenghtArray1 = ConsoleInputInt.readInt(console, "Length1: ");
        int lengthArray2 = ConsoleInputInt.readInt(console, "Length2: ");
        int a[] = generateArray(lenghtArray1);
        System.out.println();
        int b[] = generateArray(lengthArray2);
        if(verifyArray(a, b) == true) {
            System.out.print(" ==> Element/s present in arrays");
        }else {
            System.out.println("Element not present");
        }
    }
}
