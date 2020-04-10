package it.intersistemi.corsojava.lambdaexpressions.examples;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingInstituteImpl implements BankingInstitute{

    private int accountNumberCounter = 0;
    private String bankingInstituteName;
    private String abi;
    private String cab;

    public BankingInstituteImpl(String bankingInstituteName, String abi, String cab) {
        super();
        this.bankingInstituteName = bankingInstituteName;
        this.abi = abi;
        this.cab = cab;
        bankAccounts = new HashMap<>();
    }

    Map<Integer, BankAccount> bankAccounts;


    @Override
    public int addBankAccount(String holderName, String holderSurname) throws BankAccountException, NumberFormatException, IOException {
        BankAccount bankAccount = new BankAccount(holderName, holderSurname, accountNumberCounter);
        bankAccounts.put(accountNumberCounter, bankAccount);
        return accountNumberCounter++;
    }

    @Override
    public int addBankAccount(String holderName, String holderSurname, double openingBalance) throws BankAccountException, NumberFormatException, IOException {
        BankAccount bankAccount = new BankAccount(holderName, holderSurname, accountNumberCounter, 0.0);
        bankAccounts.put(accountNumberCounter, bankAccount);
        return accountNumberCounter++;

//        if(holderName == null || holderSurname == null){
//            throw new BankAccountException("Holder Name or Surname still need to be enhanced ");
//        }
//        if(openingBalance < 0){
//            throws new BankAccountException("Opening balance is negative ");
//        }
//        BankAccount newBankAccount = new BankAccount(holderName, holderSurname, ++accountNumberCounter);
//        this.bankAccounts.put(newBankAccount.getAccountNumber(), newBankAccount);
//        return newBankAccount.getAccountNumber();
    }

    @Override
    public List<BankAccount> getBankAccountList() throws BankAccountException, NumberFormatException, IOException {
        List<BankAccount> list = new ArrayList<>();
        return list;
    }

    @Override
    public BankAccount recoverBankAccountByNumber(int accountNumber) throws BankAccountException, NumberFormatException, IOException {
        return null;
    }

    @Override
    public void withdrawMoney(int accountNumber, double amount) throws BankAccountException, NumberFormatException, IOException {
        BankAccount bankAccount = this.recoverBankAccountByNumber(accountNumber);
        if(bankAccount != null){
            if(bankAccount.withdrawMoney(amount)){
                throw new BankAccountException("Error! Failed withdraw. ");
            }else{
                throw new BankAccountException("Bank Account not found! ");
            }
        }
    }

    @Override
    public void depositMoney(int accountNumber, double amount) throws BankAccountException, NumberFormatException, IOException {
        BankAccount bankAccount = this.recoverBankAccountByNumber(accountNumber);
        if(bankAccount != null){
            if(bankAccount.depositMoney(amount)){
                throw new BankAccountException("Deposit failed! ");
            }else{
                throw new BankAccountException("Bank Account not found! ");
            }
        }
    }

    @Override
    public void doBankTransfer(int accountNumber, BankingInstitute consigneeInstitute, int accountNumberConsignee, double amount) throws BankAccountException, NumberFormatException, IOException {
        this.withdrawMoney(accountNumberConsignee, amount);
    }
}
