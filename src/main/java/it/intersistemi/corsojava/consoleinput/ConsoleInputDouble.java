package it.intersistemi.corsojava.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputDouble {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
        double value = readDouble(console, "Insert value: ");
        System.out.println("Result: " + Math.pow(value, 2));
    }

    public static double readDouble(BufferedReader console, String consoleMessage) throws IOException {
        do{
            System.out.print(consoleMessage);
            String line = console.readLine();
            try{
                return Double.parseDouble(line);
            }catch(NumberFormatException exception){
                exception.printStackTrace();
            }
        }while(true);
    }
}

