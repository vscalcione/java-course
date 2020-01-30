package it.intersistemi.corsojava.lambdaexpressions.examples;

import java.io.IOException;
import java.util.List;

public interface BankingInstitute {
    int addBankAccount(String holderName, String holderSurname) throws BankAccountException, NumberFormatException, IOException;
    int addBankAccount(String holderName, String holderSurname, double openingBalance) throws BankAccountException, NumberFormatException, IOException;
    List<BankAccount> getBankAccountList() throws BankAccountException, NumberFormatException, IOException;
    BankAccount recoverBankAccountByNumber(int accountNumber) throws BankAccountException, NumberFormatException, IOException;
    void withdrawMoney(int accountNumber, double amount) throws BankAccountException, NumberFormatException, IOException;
    void depositMoney(int accountNumber, double amount) throws BankAccountException, NumberFormatException, IOException;
    void doBankTransfer(int accountNumber, BankingInstitute consigneeInstitute, int accountNumberConsignee, double amount) throws BankAccountException, NumberFormatException, IOException;
}
