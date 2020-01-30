package it.intersistemi.corsojava.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputInt {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int value = readInt(console, "Insert value: ");
        System.out.println("Result: " + Math.pow(value, 2));
    }

    public static int readInt(BufferedReader console, String consoleMessage) throws IOException {
        do{
            System.out.print(consoleMessage);
            String line = console.readLine();
            try{
                return Integer.parseInt(line);
            }catch(NumberFormatException exception){
                exception.printStackTrace();
            }
        }while(true);
    }
}
