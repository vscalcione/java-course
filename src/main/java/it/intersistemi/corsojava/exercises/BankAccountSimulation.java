package it.intersistemi.corsojava.exercises;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccountSimulation {
	public static void main(String[] args) throws IOException{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		NewBankAccount bankAccount = new NewBankAccount();
		String clientName = ConsoleInputString.readString(console, "Insert name: ").toUpperCase();
		String clientSurname = ConsoleInputString.readString(console, "Insert surname ").toUpperCase();
		bankAccount.setClientName(clientName);
		bankAccount.setClientSurname(clientSurname);
		double initialBalance = 0;
		initialBalance = bankAccount.deposit(ConsoleInputInt.readInt(console, "Insert amount: "));
		double withdrawal = ConsoleInputInt.readInt(console, "Withdrawal: ");
		if(withdrawal > initialBalance) {
			System.out.println("Withdrawal denied ");
			bankAccount.viewBalance();
		}else {
			if(withdrawal == initialBalance) {
				System.out.println("Withdrawal of " + initialBalance);
				bankAccount.withdrawl(withdrawal);
				bankAccount.viewBalance();
			}else {
				System.out.println("Withdrawl of: " + withdrawal);
				bankAccount.withdrawl(withdrawal);
				bankAccount.viewBalance();
			}
		}
		
	}
	
	public static class NewBankAccount {
		String clientSurname, clientName;
		double balance, clientBalance;
		public String getClientSurname() {
			return clientSurname;
		}
		
		public void setClientSurname(String cognomeCliente) {
			this.clientSurname = cognomeCliente;
		}
		
		public String getClientName() {
			return clientName;
		}
		
		public void setClientName(String nomeCliente) {
			this.clientName = nomeCliente;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public double getClientBalance() {
			return clientBalance;
		}
		
		public void setClientBalance(double clientBalance) {
			this.clientBalance = clientBalance;
		}
		
		public double deposit(double importo) {
			return clientBalance = clientBalance + importo;
		}
		
		public void withdrawl(double amount) {
			clientBalance = clientBalance - amount;
		}
		
		public void versaAssegno(double importo) {
			balance = balance + importo;
		}
		
		public void viewBalance() {
			System.out.println("===========================");
			System.out.println("Client name: " + clientName);
			System.out.println("Client surname: " + clientSurname);
			System.out.println("Balance: " + clientBalance);
			System.out.println("===========================");
		}
		
		public void withdrawlNew(double amount) {
			balance = balance - amount;
		}
		
		public void viewNew() {
			System.out.println("New balance: " + balance);
		}
	}
}