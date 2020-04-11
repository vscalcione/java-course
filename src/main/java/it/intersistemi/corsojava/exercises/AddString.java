package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AddString {

    static String value =  "";
    static String[] arrayString = new String[10];

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        value = ConsoleInputString.readString(console, "Insert phrase: ");
        System.out.println("\n");
        System.out.println("Obtained result: ");
        addString(value, arrayString);
    }


    public static String[] addString (String s, String []a) {
        for(int i=0; i < a.length; i++) {
            Random valueRnd=new Random();
            a[i] = valueRnd.nextInt(100)+"";
            if(i == a.length - 1) {
                a[i] = s;
            }
            System.out.print("| " + a[i]);
        }
        return a;
    }
}
