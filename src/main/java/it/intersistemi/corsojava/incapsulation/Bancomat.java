package it.intersistemi.corsojava.incapsulation;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bancomat {

    private int pin;
    private int balance;

    public Bancomat(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdrawl(int pin, int balance){
        if(this.pin == pin && this.balance == balance){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Bancomat bancomat = new Bancomat(1200, 12345);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int balanceValue = ConsoleInputInt.readInt(console, "How much do you want to withdraw? ");
        boolean withdrawlResult = bancomat.withdrawl(13245, balanceValue);
        if(withdrawlResult){
            System.out.println("\n" + "Withdrawal successful ");
        }else{
            System.out.println("\n" + "Withdrawal denied. ");
        }
    }
}
