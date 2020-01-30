package it.intersistemi.corsojava.lambdaexpressions.examples;

import it.intersistemi.corsojava.consoleinput.ConsoleInputDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccount {

    private String holderName;
    private String holderSurname;
    private int accountNumber;
    private static double currentAccountAvailability;
    private static double maxOverdraft;
    private double initialAvailability;
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public BankAccount() { }

    public BankAccount(String holderName, String holderSurname, int accountNumber, double initialAvailability) {
        super();
        this.holderName = holderName;
        this.holderSurname = holderSurname;
        this.accountNumber = accountNumber;
        this.initialAvailability = initialAvailability;
    }

    public BankAccount(String holderName, String holderSurname, int accountNumberCounter) {
        super();
        this.holderName = holderName;
        this.holderSurname = holderSurname;
        this.accountNumber = accountNumberCounter;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static double getCurrentAccountAvailability() {
        return currentAccountAvailability;
    }

    public static void setCurrentAccountAvailability(double currentAccountAvailability) {
        BankAccount.currentAccountAvailability = currentAccountAvailability;
    }

    public static double getMaxOverdraft() {
        return maxOverdraft;
    }

    public double getInitialAvailability() {
        return initialAvailability;
    }

    public void setInitialAvailability(double initialAvailability) {
        this.initialAvailability = initialAvailability;
    }

    public boolean withdrawMoney(double currentAccountAvailability, BufferedReader console) throws NumberFormatException, IOException {
        double withDraw = ConsoleInputDouble.readDouble(console, "How much do you want to withdraw? ");
        if(withDraw <= currentAccountAvailability){
            currentAccountAvailability -= withDraw;
            System.out.println("Withdrawal successful. You have withdrawn " + withDraw + " and your current balance is: " +
                    currentAccountAvailability + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public boolean depositMoney(double currentAccountAvailability, BufferedReader console) throws NumberFormatException, IOException{
        double deposit = ConsoleInputDouble.readDouble(console, "How much do you want to deposit? ");
        deposit += currentAccountAvailability;
        if(deposit > 0){
            System.out.println("Now your current balance is: " + deposit + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public boolean isOverdraft(){
        return false;
    }

    public static void setMaxOverdraft(double value){
        value = 5000;
        if(value > 5000){
            System.out.println("Operation failed. Maximum limit exceeded ");
        }
    }

    public boolean withdrawMoney(double amount) {
        if(amount <= currentAccountAvailability){
            currentAccountAvailability -= amount;
            System.out.println("Withdrawal successful. You have withdrawn " + amount + " and your current balance is: " +
                    currentAccountAvailability + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public boolean depositMoney(double amount) {
        amount += currentAccountAvailability;
        if(amount > 0){
            System.out.println("Now your current balance is: " + amount + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        BankingInstitute bnl = new BankingInstituteImpl("BNL", "00100", "12345");
        BankingInstitute intesa = new BankingInstituteImpl("Intesa SanPaolo", "00200", "54321");
        BankingInstitute unicredit = new BankingInstituteImpl("Unicredit", "00300", "21345");
        try{
            int firstBankAccount = bnl.addBankAccount("clientName1", "clientSurname1");
            int secondBankAccount = intesa.addBankAccount("clientName2", "clientSurname2");
            int thirdBankAccount = unicredit.addBankAccount("clientName3", "clientSurname3");
            int fourthBankAccount = unicredit.addBankAccount("clientName4", "clientSurname4");
            unicredit.doBankTransfer(thirdBankAccount, bnl, firstBankAccount, 300);
            intesa.doBankTransfer(secondBankAccount, unicredit, fourthBankAccount, 500);
            System.out.println(bnl.recoverBankAccountByNumber(firstBankAccount));
            System.out.println(intesa.recoverBankAccountByNumber(secondBankAccount));
            System.out.println(unicredit.recoverBankAccountByNumber(thirdBankAccount));
            System.out.println(unicredit.recoverBankAccountByNumber(fourthBankAccount));
        }catch(BankAccountException | IOException exception){
            exception.printStackTrace();
        }
    }
}
