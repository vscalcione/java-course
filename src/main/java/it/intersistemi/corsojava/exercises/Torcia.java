package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Torcia {

    private boolean torciaState = false;

    public Torcia(boolean torciaState) {
        this.torciaState = torciaState;
    }

    public Torcia(){}

    public boolean isTorciaState() {
        return torciaState;
    }

    public void setTorciaState(boolean torciaState) {
        this.torciaState = torciaState;
    }

    public void turnOn(){
        torciaState = true;
    }

    public void turnOff(){
        torciaState = false;
    }

    public boolean getTorciaState(){
        if(torciaState){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        String choice;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Torcia firstTorcia = new Torcia();
        Torcia secondTorcia = new Torcia();
        firstTorcia.turnOn();
        secondTorcia.turnOn();
        firstTorcia.turnOff();
        if(firstTorcia.getTorciaState()){
            System.out.println("Torcia1 accesa");
            choice = ConsoleInputString.readString(console, "Vuoi spegnerla? (si/no): ");
            if(choice == "si"){
                firstTorcia.turnOff();
                System.out.println("Torcia1 spenta ");
            }
        }else{
            System.out.println("Torcia1 spenta ");
            choice = ConsoleInputString.readString(console, "Vuoi accenderla? (si/no): ");
            if(choice == "si"){
                firstTorcia.turnOn();
                System.out.println("Torcia1 accesa");
            }
        }
        System.out.println("*************************************");
        if(secondTorcia.getTorciaState()){
            System.out.println("Torcia2 accesa");
            choice = ConsoleInputString.readString(console, "Vuoi spegnerla? (si/no): ");
            if(choice == "si"){
                secondTorcia.turnOff();
                System.out.println("Torcia2 spenta ");
            }
        }else{
            System.out.println("Torcia2 spenta ");
            choice = ConsoleInputString.readString(console, "Vuoi accenderla? (si/no): ");
            if(choice == "si"){
                secondTorcia.turnOn();
                System.out.println("Torcia2 accesa");
            }
        }
    }
}