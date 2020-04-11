package it.intersistemi.corsojava.array;

import java.util.Random;

public class SearchMaxMinValueArray {

    public static void main(String[] args) {
        Random value = new Random();
        int[] arrayInt = new int[7];
        System.out.println("**** Original Array ****");
        for(int index = 0; index < arrayInt.length; index ++){
            int randomValue = 1 + value.nextInt(10);
            arrayInt[index] = randomValue;
            System.out.print(arrayInt[index] + "| ");
        }
        System.out.println("\n");
        System.out.println("*******************");
        searchMaxAndMinValue(arrayInt);
    }

    public static void searchMaxAndMinValue(int array[]){
        int maxValue = 0;
        int minValue = 0;
        maxValue = array[0];
        for(int index = 1; index < array.length; index ++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }

        minValue = array[0];
        for(int index = 1; index < array.length; index ++) {
            if(array[index] < minValue){
                minValue = array[index];
            }
        }
        System.out.println("Max Value is: "+ maxValue);
        System.out.println("Min Value is: "+ minValue);

    }
}
