package it.intersistemi.corsojava.entrypoints;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryPoint {
    public static float[] arrayResults = new float[4];
    public static boolean isValidArrayIndex = false;
    public static int arrayIndex = 0;
    public int firstValue;
    public int secondValue;

    public static void main(String[] args) throws IOException {
        int firstValue, secondValue, choice;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        do{
            initializeMenu();
            choice = ConsoleInputInt.readInt(console, "Insert your choice: ");
            if(choice < 1 || choice > 4){
                System.out.println("Error");
            }
        }while(choice < 1 || choice > 4);
        if(choice == 1){
            firstValue = ConsoleInputInt.readInt(console, "Insert first value: ");
            secondValue = ConsoleInputInt.readInt(console, "Insert second value: ");
            float sum = Math.sum(firstValue, secondValue);
            System.out.println("Sum : " + sum);
            System.out.println("****************************************************");
            isValidArrayIndex = arrayIndex < arrayResults.length;
            arrayResults[arrayIndex] = sum;
            System.out.println("Boolean variable state: "+ isValidArrayIndex);
        }else{
            if(choice == 2){
                firstValue = ConsoleInputInt.readInt(console, "Insert first value: ");
                secondValue = ConsoleInputInt.readInt(console, "Insert second value: ");
                float difference = Math.difference(firstValue,  secondValue);
                System.out.println("Difference: " + difference);
                isValidArrayIndex = arrayIndex < arrayResults.length;
                arrayResults[++arrayIndex] = difference;
            }else{
                if(choice == 3){
                    firstValue = ConsoleInputInt.readInt(console, "Insert first value: ");
                    secondValue = ConsoleInputInt.readInt(console, "Insert second value: ");
                    float product = Math.product(firstValue, secondValue);
                    System.out.println("Product: " + product);
                    isValidArrayIndex = arrayIndex < arrayResults.length;
                    arrayResults[++arrayIndex] = product;
                }else{
                    firstValue = ConsoleInputInt.readInt(console, "Insert first value: ");
                    secondValue = ConsoleInputInt.readInt(console, "Insert second value: ");
                    float quozient = Math.quozient(firstValue, secondValue);
                    System.out.println("Quozient: " + quozient);
                    isValidArrayIndex = arrayIndex < arrayResults.length;
                    arrayResults[++arrayIndex] = quozient;
                }
            }
        }

        ++arrayIndex;
        isValidArrayIndex = arrayIndex < arrayResults.length;
        System.out.println("Boolean variable state: " + isValidArrayIndex);
    }

    public static void initializeMenu(){
        System.out.println("Press 1 to Sum ");
        System.out.println("Press 2 to Difference ");
        System.out.println("Press 3 for Multiply ");
        System.out.println("Press 4 for Division ");
    }
}
