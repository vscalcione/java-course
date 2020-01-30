package it.intersistemi.corsojava.flowcontrol;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AddString {

    static String inputString = "";
    static String[] arrayString = new String[10]; //{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        inputString = ConsoleInputString.readString(console, "Insert value to add at the end of our array: ");
        System.out.println("Reuslt: ");
        addString(inputString, arrayString);
    }

    private static String[] addString(String inputString, String[] arrayString) {
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
}
