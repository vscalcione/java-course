package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputFloat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertBytesToOther {

    public static void main(String[] args) throws IOException {
        float variable;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("========== Convert Byte to Other ========== \n");
        String choice = "";
        do{
            variable = ConsoleInputFloat.readFloat(console, "Quale grandezza vuoi convertire? (partendo da byte) ");
            System.out.println("Result: " + byteToOther(variable, 2));
            if(!(choice.equals("yes") || choice.equals("y"))){
                break;
            }
        }while(choice.equals("yes") || choice.equals("y"));
    }

    public static String byteToOther(double bytes, int digits){
        String[] dataDimension = {"Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes", "Petabytes", "Etabytes", "Zetabytes", "Yetabytes"};
        double initialInput = 0;
        int i = 0;
        for(i = 0; i < dataDimension.length; i++){
            if(bytes < 1024){
                break;
            }
            initialInput = bytes;
            bytes = bytes / 1024;
        }
        return initialInput + " bytes " + " ======> " + String.format("%." + digits + "f", bytes) + " " + dataDimension[i];
    }
}
