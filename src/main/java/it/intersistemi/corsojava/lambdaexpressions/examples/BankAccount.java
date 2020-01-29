package it.intersistemi.corsojava.lambdaexpressions.examples;

import it.intersistemi.corsojava.consoleinput.ConsoleInputDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccount {

    private String accountHolderName;
    private String accountHolderSurname;
    private int accountNumber;
    private double currentAccountAvailability;
    private double initialAccountAvailability;
    private double maxiumOverdraft;
    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public BankAccount() {
    }

    public BankAccount(String accountHolderName, String accountHolderSurname, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountHolderSurname = accountHolderSurname;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountHolderSurname, int accountNumber, double initialAccountAvailability) {
        this.accountHolderName = accountHolderName;
        this.accountHolderSurname = accountHolderSurname;
        this.accountNumber = accountNumber;
        this.initialAccountAvailability = initialAccountAvailability;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderSurname() {
        return accountHolderSurname;
    }

    public void setAccountHolderSurname(String accountHolderSurname) {
        this.accountHolderSurname = accountHolderSurname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentAccountAvailability() {
        return currentAccountAvailability;
    }

    public void setCurrentAccountAvailability(double currentAccountAvailability) {
        this.currentAccountAvailability = currentAccountAvailability;
    }

    public double getInitialAccountAvailability() {
        return initialAccountAvailability;
    }

    public void setInitialAccountAvailability(double initialAccountAvailability) {
        this.initialAccountAvailability = initialAccountAvailability;
    }

    public double getMaxiumOverdraft() {
        return maxiumOverdraft;
    }

    public void setMaxiumOverdraft(double maxiumOverdraft) {
        this.maxiumOverdraft = maxiumOverdraft;
    }

    public BufferedReader getConsole() {
        return console;
    }

    public void setConsole(BufferedReader console) {
        this.console = console;
    }

    public boolean withdrawal(double currentAccountAvailability) throws IOException {
        double atmWithdrawal = ConsoleInputDouble.readDouble(console, "How much do you want to withdraw? ");
        if(atmWithdrawal <= currentAccountAvailability){
            currentAccountAvailability -= atmWithdrawal;
            System.out.println("Withdrawal successful. You have withdrawn " + atmWithdrawal + " euros and your current balance is: "
                    + currentAccountAvailability + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public boolean deposit(double currentAccountAvailability) throws IOException {
        double atmDeposit = ConsoleInputDouble.readDouble(console, "How much do you want to deposit? ");
        atmDeposit += currentAccountAvailability;
        if(atmDeposit > 0){
            System.out.println("Now your current balance is: " + atmDeposit + " euros ");
            return true;
        }else{
            return false;
        }
    }

    public boolean isOverdraft(){
        return false;
    }

//    public static void setMaxiumOverdraft(double value){
//        value = 5000;
//        if(value > 5000){
//            System.out.println("Operation failed. Maximum limit exceeded ");
//        }
//    }

//    public static void main(String[] args) {
//        BankingInstitute bln = new BankingInstituteImpl("BNL", "00100", "12345");
//        BankingInstitute intesaSanPaolo = new BankingInstituteImpl("Intesa San Paolo", "00200", "54321");
//        BankingInstitute unicredit = new BankingInstituteImpl("Unicredit", "00300", "21435");
//        try {
//            int firstBankAccount = bnl.addBankAccount("clientName1", "clientSurname1");
//            int secondBankAccount = intesaSanPaolo.addBankAccount("clientName1", "clientSurname1");
//            int thirdBankAccount = unicredit.addBankAccount("clientName1", "clientSurname1");
//            int fourthBankAccount = unicredit.addBankAccount("clientName1", "clientSurname1");
//            unicredit.doBankTransfer(thirdBankAccount, bln, firstBankAccount, 300);
//            unicredit.doBankTransfer(thirdBankAccount, intesaSanPaolo, secondBankAccount, 500);
//
//            System.out.println(bnl.);
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//        } catch (BankAccountException exception) {
//            exception.printStackTrace();
//        }
//
//    }
}
