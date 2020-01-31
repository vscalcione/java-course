package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AddString {

    static String inputString = "";
    static String[] arrayString = new String[10]; //{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    static String[] arrayString1 = {"Uno","Due","Tre","Quattro","Cinque","Sei"};

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        inputString = ConsoleInputString.readString(console, "Insert value to add at the end of our array: ");
        System.out.println("Result: ");
        addNewString(inputString, arrayString);

        String stringToAdd = ConsoleInputString.readString(console, "Cosa vuoi aggiungere al tuo array? ");
        String[] arrayStringComplete = addNewString(arrayString, stringToAdd);
        System.out.println("Result: ");
        for (String string : arrayStringComplete) {
            System.out.print("| " + string.toUpperCase());
        }
    }

    private static String[] addNewString(String inputString, String[] arrayString) {
        for(int index = 0; index < arrayString.length; index++){
            Random value = new Random();
            arrayString[index] = value.nextInt(100) + "";
            if(index == arrayString.length - 1){
                arrayString[index] = inputString;
            }
            System.out.println("| " + arrayString[index]);
        }
        return arrayString;
    }

    public static String[] addNewString(String[] arrayString, String stringToAdd) {
        String[] stringArrayComplete = new String[arrayString.length + 1];
        for (int i = 0; i < arrayString.length; i++) {
            stringArrayComplete[i] = arrayString [i];
        }
        stringArrayComplete[stringArrayComplete.length -1] = stringToAdd;
        return stringArrayComplete;
    }
}
