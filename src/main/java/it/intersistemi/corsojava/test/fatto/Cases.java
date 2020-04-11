package it.intersistemi.corsojava.test.fatto;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cases {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String choice = ConsoleInputString.readString(console, "Insert choice: ");
		do{
		    if(choice.equalsIgnoreCase("true")){
                System.out.println("OK");
                break;
            }
		    if(choice.equalsIgnoreCase("false")){
                System.out.println("KO");
                break;
            }
            if(choice.equalsIgnoreCase("exit")){
                break;
            }
        }while(choice.equalsIgnoreCase("exit"));
	}
}
